package com.gms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/add")
	public void add() {}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping("/modify")
	public void modify() {}
	@RequestMapping("/romove")
	public void remove() {}
	@RequestMapping("/login")
	public String login() {
		HomeController.logger.info("MemberController login ::: {}.", "ENTER");
		return "login_success";
	}
	@RequestMapping("/logout")
	public String logout() {
		HomeController.logger.info("MemberController logout ::: {}.");
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
