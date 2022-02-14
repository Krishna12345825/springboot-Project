package com.krishna.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hsptl")
@Data
@PropertySource("classpath:input.properties")
public class Hospital {
	
	@Value("KIMS")  // hard Coding
	private String name;
	
	@Value("30") // hard coding
	private int rank;
	
	@Value("${hsptl.name}")  // collecting from properties file 
	private String name1;
	
	@Value("${hsptl.age}")  // collecting from properties file 
	private int age;
	
	@Value("${Path}")  // injecting from env... variable 
	private String pathData;
	
	
	@Value("${os.name}")  // injecting system property value 
	private String os;
	
	@Autowired  // Autowiring 
	@Value("#{lInfo}")   // using SPEL performing injection to object type property
	private LabTestsInfo info;
	
	@Value("#{lInfo.bloodProfilePrice+lInfo.rtpcrPrice}")  // SPEL based arithmetic operation and injection
	private float labTestsBillAmt;

}
