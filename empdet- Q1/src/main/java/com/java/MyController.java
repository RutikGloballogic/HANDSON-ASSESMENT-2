package com.java;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MyController {

  @RequestMapping("/hello")

  public String display(HttpServletRequest req,Model m)

  {

    //read the provided form data

	  String Eno=req.getParameter("no");

	    String Ename=req.getParameter("name");
	    String Salary=req.getParameter("sal");
	    String Designation=req.getParameter("des");



	      String msg1="Empno: "+ Eno;
	      m.addAttribute("message1", msg1);
	      
	      
	      String msg2="Ename: "+ Ename;
	      m.addAttribute("message2", msg2);
	      
	      String msg3="Salary: "+ Salary;
	      m.addAttribute("message3", msg3);
	      
	      String msg4="Designation: "+ Designation;
	      m.addAttribute("message4", msg4);

	   
	      return "viewpage";

  }

}