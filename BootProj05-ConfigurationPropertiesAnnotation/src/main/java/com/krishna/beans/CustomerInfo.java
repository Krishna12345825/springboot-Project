package com.krishna.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("custInfo")
@ConfigurationProperties(prefix="cust.info")
@Setter
public class CustomerInfo {

	// spring bean properties 
	private String name1;
	private int age ;
	private String addrs;
	private float billAmt;
	
	
	@Override
	public String toString() {
		return "CustomerInfo [name1=" + name1 + ", age=" + age + ", addrs=" + addrs + ", billAmt=" + billAmt + "]";
	}
	
	
	
}
