package in.ineuron;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.compo.WishMessageGenerator;

@SpringBootApplication
public class Boot01_BasicAppApplication {

	
	static {
		System.out.println("Boot01_BasicAppApplication class is loading....");
	}
	
	public Boot01_BasicAppApplication() {
		System.out.println("Boot01_BasicAppApplication class object is intanstiated...");
	}
	
	@Bean("timeObj")
	public LocalTime createTimeObj() {
		return LocalTime.now();
	}
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Boot01_BasicAppApplication.class, args);
		
		WishMessageGenerator wsg=context.getBean(WishMessageGenerator.class);
		
		String msg=wsg.greetUser("chandan");
		
		System.out.println(msg);
		
		((ConfigurableApplicationContext) context).close();
		
	}

}
