package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SubFronEnd {
	
	@RequestMapping({"/","/hello"})
	public ModelAndView  welcome()
	{
		ModelAndView mv = new ModelAndView("welcome.jsp");
		mv.addObject("message" , "Devoted work is needed!"); 
		return mv;
	}

}
