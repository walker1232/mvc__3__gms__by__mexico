package com.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {	
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute MemberDTO member) {
		logger.info("MemberController add ::: {}.", "add");
		System.out.println("ADD 1 " + member);
		memberService.add(member);
		/*Map<String, Object> p = new HashMap<>();
		p.put("add", member);
		System.out.println("name is "+ member.getName());*/
		return "login_page";
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve/{memID}/{action}")
	public String retrieve(@PathVariable String memID, @PathVariable String action ,Model model) {
		logger.info("\n--------- MemberController {} !!-----","retrieve()");
		System.out.println(memID);
		/*MemberDTO m = memberService.retrieve(memID);
		model.addAttribute("user", m);
		return "retrieve_page";*/
		member.setMemID(memID);
		String res = "";
		switch(action) {
		case "modify":
			logger.info("MemberController modify ::: {}.", "modify");
			res = "modify_page";
			break;
		case "remove":
			logger.info("MemberController remove ::: {}.", "remove");
			res = "remove_page";
			break;
		default:
			logger.info("MemberController retrieve ::: {}.", "retrieve");
			res = "retrieve_page";
			break;
		}
		/*if(action.equals("modify")) {
			res = "modify_page";
		}else if(action.equals("remove")) {
			res = "remove_page";
		}else {
			res = "retrieve_page";
		}*/
		model.addAttribute("user", memberService.retrieve(member));
		return res;
	}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(@ModelAttribute("member") MemberDTO member, Model model) {
		logger.info("MemberController modify ::: {}.", "ENTER");
		System.out.println("modify 1 " + member.getMemID());
		//member.setMemID(memID);
		memberService.modify(member);
		model.addAttribute("user", memberService.retrieve(member));
		//MemberDTO m = memberService.retrieve(memID);
		//model.addAttribute("user", m);
		return "retrieve_page";
	}
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@ModelAttribute("member") MemberDTO member, Model model) {
		logger.info("MemberController remove ::: {}.", "ENTER");
		System.out.println("remove 1 " + member.getMemID());
		System.out.println("member session : "+ member.getPassword());
		memberService.remove(member);
		return "redirect:/";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("member") MemberDTO member, Model model) {
		logger.info("MemberController login ::: {}.", "ENTER");
		//boolean m = memberService.login(member);
		member = memberService.login(member);
		String f = "";
		if(member != null) {
			f = "login_success";
			model.addAttribute("user", memberService.retrieve(member));
		}else {
			f = "login_page";
		}
		
		/*if(m == true) {
		f = "login_success";
		MemberDTO mem = memberService.retrieve(member.getMemID());
		model.addAttribute("user", mem);
		}else {
		f = "login_page";
		}*/
		
		/*if(m == true) {
			f = "login_success";
			model.addAttribute("user", memberService.retrieve(member));
		}else {
			f = "login_page";
		}*/
		return f;
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("MemberController logout ::: {}.", "ENTER");
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
