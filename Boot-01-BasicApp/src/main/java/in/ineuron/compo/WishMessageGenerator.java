package in.ineuron.compo;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {

	@Autowired
	LocalTime time;
	
	static {
		System.out.println("WishMessageGenerator class is loading....");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator class object is intanstiated...");
	}
	
	public String greetUser(String userName) {
		int hour=time.getHour();
		
		if(hour<12)
			return "Good morning "+userName;
		else if(hour<16)
			return "Good afternoon "+userName;
		else if(hour<20)
			return "Good eveing "+userName;
		else
			return "Good night "+userName;
	}
}
