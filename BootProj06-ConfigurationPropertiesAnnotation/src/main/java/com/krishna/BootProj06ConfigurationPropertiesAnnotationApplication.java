package com.krishna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.krishna.beans.PersonInfo;

@SpringBootApplication
public class BootProj06ConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		// get IOC Container
		ApplicationContext ctx =SpringApplication.run(BootProj06ConfigurationPropertiesAnnotationApplication.class, args);
		// get Spring Bean class object 
		PersonInfo person = ctx.getBean("pInfo",PersonInfo.class);
		// invoke the methods
		System.out.println("PersonInfo Object details::+person");
		
		// close container
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
