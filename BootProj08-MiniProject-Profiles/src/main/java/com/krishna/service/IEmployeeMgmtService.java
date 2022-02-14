package com.krishna.service;

import java.util.List;

import com.krishna.model.Employee;

public interface IEmployeeMgmtService {

	 public   List<Employee> fetchEmpDetailsByDesgs(String desg1,String desg2,String desg3)throws Exception;
}
