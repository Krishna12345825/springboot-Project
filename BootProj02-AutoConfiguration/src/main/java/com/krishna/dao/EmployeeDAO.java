package com.krishna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("empDAO")
public class EmployeeDAO {
 private static final String GET_EMP_COUNT1="SELECT COUNT(*) FROM author";

 private static final String GET_EMP_COUNT = null;
 
	@Autowired
	private DataSource ds;  //Has -A property
	// method with persistence logic
   public int getEmpsCount() throws Exception{
	   //get pooled jdbc con object 
	   Connection con=ds.getConnection();
	   // create PreparedStatment object having Sql query
	   PreparedStatement ps =con.prepareStatement(GET_EMP_COUNT1);
	   // Execute the Query 
	   ResultSet rs=ps.executeQuery();
	   // process the resultSet
	   rs.next();
	  int count=rs.getInt(1);
	  // close jdbc objects
	  rs.close();
	  ps.close();
	  con.close();
	  return count;
   }  //method 
}  // class
