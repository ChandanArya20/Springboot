package in.ineuron.service.impl;

import in.ineuron.service.GreetService;
import org.springframework.stereotype.Component;

@Component
public class GreetInEnglish implements GreetService {
    @Override
    public void greet(String name) {
        System.out.println("Welcome "+name+"!");
    }
}
