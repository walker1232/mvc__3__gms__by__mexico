package com.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public void modify(@ModelAttribute MemberDTO member, Model model) {
		
	}
	@RequestMapping("/romove")
	public void remove(@ModelAttribute MemberDTO member, Model model) {
		
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute MemberDTO member, Model model) {
		logger.info("MemberController login ::: {}.", "ENTER");
		boolean m = memberService.login(member);
		String f = "";
		if(m == true) {
			f = "login_success";
			model.addAttribute("user", memberService.retrieve(member));
		}else {
			f = "login_page";
		}
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
