package com.learn.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learn.dao.DbUtility;
import com.learn.model.Student;


@Controller
public class SubFronEnd {
	
	@Autowired
	private DbUtility dbUtility;
	
	@RequestMapping({"/","/hello"})
	public ModelAndView  welcome()
	{
		ModelAndView mv = new ModelAndView("welcome.jsp");
		mv.addObject("message" , "Devoted work is needed!"); 
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView  deleteRow(int id)
	{
		dbUtility.deleteById(id);
		ModelAndView mv = new ModelAndView("welcome.jsp");
		mv.addObject("messagedelete" , "Deleted row having id " + id); 
		return mv;
	}
	
	@RequestMapping("/getrow")
	public ModelAndView  getRow(int id)
	{
		Optional<Student> student = dbUtility.findById(id); 
		if(student.isPresent())
		{
			ModelAndView mv = new ModelAndView("welcome.jsp");
			mv.addObject("messagegetrow" , student.toString()); 
			return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView("welcome.jsp");
			mv.addObject("messagegetrow" , "no row with id " + id); 
			return mv;
		}
	}
	@RequestMapping(value ="/addGet", method=RequestMethod.GET )
	public ModelAndView createStudentInfo(Student student)
	{
		if(student == null)
			System.out.println("Sudent NULL");
		else
		{
			System.out.println("Sudent not NULL");
			dbUtility.save(student); 
			ModelAndView mv = new ModelAndView("welcome.jsp");
			mv.addObject("messagepost","");
			mv.addObject("messageget" , "Successfully added " + student.getName()); 
			return mv;
		}
		
		return null;
	}
	
	@RequestMapping(value ="/update", method=RequestMethod.POST )
	public ModelAndView updateStudent(Student student)
	{
		if(student == null)
			System.out.println("Sudent NULL");
		else
		{
			System.out.println("Sudent not NULL");
			dbUtility.save(student); 
			ModelAndView mv = new ModelAndView("welcome.jsp");
			mv.addObject("messageupdate",student.toString());
			
			return mv;
		}
		
		return null;
	}
	@RequestMapping(value ="/addPost", method=RequestMethod.POST )
	public ModelAndView createStudentInfoPost(Student student)
	{
		if(student == null)
			System.out.println("Sudent NULL");
		else
		{
			System.out.println("Sudent not NULL");
			dbUtility.save(student); 
			ModelAndView mv = new ModelAndView("welcome.jsp");
			mv.addObject("messagepost",student.toString());
			
			return mv;
		}
		
		return null;
	}
}
