package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Company1;


@SpringBootApplication
public class PropertiesLoadingApplication {

	public static void main(String[] args) {
		  ConfigurableApplicationContext context = SpringApplication.run(PropertiesLoadingApplication.class, args);
		
		  Company1 company1 = context.getBean(Company1.class);
		 
		  
		  System.out.println(company1);
		 
		
	}

}
