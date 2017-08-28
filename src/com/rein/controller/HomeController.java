package com.rein.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.rein.model.User;
import com.rein.service.LoginService;

@Controller
@SessionAttributes("User")
public class HomeController {
	
	private final static Logger logger= Logger.getLogger("WelcomeController.class");
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public String welcome(){
		logger.info("inside welcome controller");
		return "index"; 
	}
	
	@RequestMapping("/sign_in")
	public String signIN(){
		
		return "login"; 
	}

	@RequestMapping("/login")
	public String login(@ModelAttribute("user") User user,HttpServletRequest request,HttpServletResponse response,HttpSession session){
		logger.info("login : "+user.toString());
		 User logUser = loginService.login(user.getUserName(),user.getPassword());
		logger.info("login : "+logUser.toString());
		ModelAndView mv = new ModelAndView();		
		if(logUser.getUserName() == null)
		{
			mv.setViewName("login");
			mv.addObject("errorMsg","Incorrect Credentials");
		
		}
		else if(logUser.getUserName().equalsIgnoreCase(user.getUserName()))
		{
			session.setAttribute("User", logUser);
			return "redirect:/";
		
			
		}
		
		
		return "login";
		
	}
	
	@RequestMapping("/contact")
	public String contactUs(){
		
		return "contact"; 
	}
	@RequestMapping("/error")
	public String error(){
		logger.info("inside welcome controller");
		return "PageNotFound"; 
	}
}
