package in.ineuron.comp;

import in.ineuron.service.GreetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test {

    GreetService greetService;

//    public Test() {
//        System.out.println("Test.Test() zero args constructor");
//    }
    public Test( @Qualifier("greetInHindi") GreetService greetService) {
        this.greetService = greetService;
        System.out.println("Test.Test() parameterized constructor");
    }

    public void greetUser(String user){
        greetService.greet(user);
    }

}
