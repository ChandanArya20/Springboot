package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Company1;
import in.ineuron.comp.Company2;

@SpringBootApplication
public class PropertiesLoadingApplication {

	public static void main(String[] args) {
		  ConfigurableApplicationContext context = SpringApplication.run(PropertiesLoadingApplication.class, args);
		
		  Company1 company1 = context.getBean(Company1.class);
		  Company2 company2 = context.getBean(Company2.class);
		  
		  System.out.println(company1);
		  System.out.println(company2);
		
	}

}
