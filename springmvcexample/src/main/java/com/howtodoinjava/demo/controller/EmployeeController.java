package com.howtodoinjava.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.howtodoinjava.demo.service.EmployeeManager;

@Controller
@RequestMapping("/employee-module")
public class EmployeeController
{
	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
	}
	@RequestMapping(value = "/getAllEmployeesTechnology", method = RequestMethod.GET)
	public String getAllEmployeesTechnology(Model model)
	{
		model.addAttribute("employees", manager.getAllEmployeesTechnology());
		return "employeesTechnology";
	}
	@RequestMapping(value = "/loginPage" , method = RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("employees", manager.loginPage());
		return "employeeLogin";
	}
	
	@RequestMapping(value = "/auth" , method = RequestMethod.GET)
	public void auth(@RequestParam String username, @RequestParam String password){
		
		String uname = "Rinku";
		if(uname.equals(username)) {
			System.out.println("success");
		}else {
			System.out.println("error");
		}
		
	}
	
}