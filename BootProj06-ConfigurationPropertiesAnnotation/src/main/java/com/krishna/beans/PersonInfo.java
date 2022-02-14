package com.krishna.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component("pInfo")
@ConfigurationProperties(prefix="per.info")
public class PersonInfo {
	
	// Simple/ wrapper type 
	private Integer pid;
	private String pname;
	// array type 
	private  String[] favColors;
	// List-Collection type 
	private List<String> studies;
	// Set-Collection type 
	private Set<Long> phoneNumbers;
	// Map- Collection type 
	private Map<String, Object>idDetails;
	
	
	// HAS-A type (Composition)
	//private jobDetails jobInfo;


	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", favColors=" + Arrays.toString(favColors)
				+ ", studies=" + studies + ", phoneNumbers=" + phoneNumbers + ", idDetails=" + idDetails + "]";
	}
	
	
	

}
