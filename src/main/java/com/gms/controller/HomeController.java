package com.gms.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("ctx")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)	// mapping은 key와 value를 준 것
	public String home(HttpSession session, HttpServletRequest request) {			// 여기서의 Model은 POM.xml에서 전역으로 정의된 것 Model안에는 request가 들어있음..
		String ctx = request.getContextPath();
		logger.info("Welcome home! The client locale is {}.", ctx);
		session.setAttribute("ctx", ctx);
		//model.addAttribute("serverTime", "" );
		
		return "home";
	}
	
}
