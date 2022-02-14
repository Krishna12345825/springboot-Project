package com.krishna.beans;
// target class 
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
     @Autowired
     private Calendar calendar;
     
	//b.method
	public String generateWishMessage(String user) {
		// get current hour of the day
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generate wish message
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else 
			return "Good Night::"+user;
		
		
	}
}
