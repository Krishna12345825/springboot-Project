package com.krishna;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.krishna.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj0DependencyInjectionApplication {

	@Bean(name="cal")
	public Calendar createCalendar() {
		return Calendar.getInstance(); //return GregorionCalendar class(sub class of calendar) obj
	}
	
	public static void main(String[] args) {
		//Bootstrap  /boot spring boot App and get IOC container ref
	
		ApplicationContext ctx=	SpringApplication.run(BootProj0DependencyInjectionApplication.class, args);
		// get target class object
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		// invoke  b.method
		String result= generator.generateWishMessage("krishna");
		System.out.println("wish Message is ::"+result);
		
		
		// close container 
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
