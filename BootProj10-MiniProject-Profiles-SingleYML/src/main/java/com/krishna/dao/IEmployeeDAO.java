package com.krishna.dao;

import java.util.List;

import com.krishna.model.Employee;



public interface IEmployeeDAO {
        public  List<Employee>  getEmpsByDesgs(String desg1,String desg2,String desg3)throws Exception;
}