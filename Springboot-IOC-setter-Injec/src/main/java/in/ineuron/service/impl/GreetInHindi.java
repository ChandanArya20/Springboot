package in.ineuron.service.impl;

import in.ineuron.service.GreetService;
import org.springframework.stereotype.Component;

@Component
public class GreetInHindi implements GreetService {
    @Override
    public void greet(String name) {
        System.out.println("Swagat "+name+"!");
    }
}
