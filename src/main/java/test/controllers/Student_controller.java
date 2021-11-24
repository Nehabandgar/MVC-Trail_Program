package test.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.beans.Student_bean;
import test.dao.Student_dao;


@Controller
public class Student_controller 
{
	
	@Autowired
	Student_dao dao;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String save(@ModelAttribute("stud") Student_bean stud)
	
	{
		/*String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		System.out.println("fname="+fname);
		System.out.println("lname="+lname);
		System.out.println("email="+email);
		System.out.println("password="+password);*/
		
	//	return null;
		
		dao.save(stud);
		
		return "redirect:/welcome";
	}

}
