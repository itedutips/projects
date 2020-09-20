package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learn.service.HelloService;

@Controller
public class LoginController {
	
	@Autowired
	private HelloService service;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	@Bean
	public String hello()
	{
		return "login";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST )
	public ModelAndView helloLogin(@RequestParam String UserName,@RequestParam String Password)
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("username", UserName);
		
		boolean result = service.validate(UserName, Password);
		if(result) 
		{
		    
			mv.setViewName("welcome");
		}
		else 
		{
			mv.setViewName("login");
		}
		return mv;
		
	}

}
