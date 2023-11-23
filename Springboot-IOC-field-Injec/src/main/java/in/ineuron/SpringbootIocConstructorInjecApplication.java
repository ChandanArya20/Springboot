package in.ineuron;

import in.ineuron.comp.Test;
import in.ineuron.service.GreetService;
import in.ineuron.service.impl.GreetInEnglish;
import in.ineuron.service.impl.GreetInHindi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class  SpringbootIocConstructorInjecApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootIocConstructorInjecApplication.class, args);


		Test bean = context.getBean(Test.class);

		bean.greetUser("Arya");


	}

}
