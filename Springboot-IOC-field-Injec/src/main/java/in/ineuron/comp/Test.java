package in.ineuron.comp;

import in.ineuron.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Autowired
    @Qualifier("greetInHindi")
    GreetService greetService;

    public void greetUser(String user){
        System.out.println(greetService);
        greetService.greet(user);
    }

}
