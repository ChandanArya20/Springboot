package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Employee;

@SpringBootApplication
public class PropertiesLoadingApplication {

	public static void main(String[] args) {
		
		  ConfigurableApplicationContext context = SpringApplication.run(PropertiesLoadingApplication.class, args);
		
		  Employee employee = context.getBean(Employee.class);
		  
		  System.out.println(employee);
		
	}

}
