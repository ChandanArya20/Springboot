package in.ineuron;

import in.ineuron.comp.Test;
import in.ineuron.service.GreetService;
import in.ineuron.service.impl.GreetInHindi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class  SpringbootIocConstructorInjecApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootIocConstructorInjecApplication.class, args);

//		GreetService bean = context.getBean(GreetService.class); // NoUniqueBeanDefinitionException

//		GreetInHindi bean = context.getBean(GreetInHindi.class);
//
//		bean.greet("Chandan");


		Test bean = context.getBean(Test.class);

		bean.greetUser("Arya");


	}

}
