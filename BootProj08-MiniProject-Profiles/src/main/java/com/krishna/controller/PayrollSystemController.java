package com.krishna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.krishna.model.Employee;
import com.krishna.service.IEmployeeMgmtService;

@Controller("controller")
public class PayrollSystemController {
	@Autowired
	private  IEmployeeMgmtService service;
	
	public   List<Employee> showEmpsDetailsByDesgs(String desg1,String desg2,String desg3)throws Exception{
		//use service 
		List<Employee>  listEmps=service.fetchEmpDetailsByDesgs(desg1, desg2, desg3);
		return  listEmps;
		
	}

}