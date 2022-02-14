package com.krishna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.krishna.beans.CustomerInfo;

@SpringBootApplication
public class BootProj05ConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		
		// get IOC container
		ApplicationContext ctx =SpringApplication.run(BootProj05ConfigurationPropertiesAnnotationApplication.class, args);
		// Get Spring class object
		CustomerInfo info= ctx.getBean("custInfo", CustomerInfo.class);
		// invoke method  b.method
		System.out.println("CustomerInfo object data::"+info);
		
		// close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
