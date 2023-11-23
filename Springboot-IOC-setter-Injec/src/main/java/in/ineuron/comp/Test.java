package in.ineuron.comp;

import in.ineuron.service.GreetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Test {
    GreetService greetService;

    public void setGreetService(GreetService greetService) {
        System.out.println("Test.setGreetService");
        this.greetService = greetService;
    }

    public void greetUser(String user){
        System.out.println(greetService);
        greetService.greet(user);
    }

}
