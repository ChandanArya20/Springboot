package in.ineuron.config;

import in.ineuron.comp.Test;
import in.ineuron.service.GreetService;
import in.ineuron.service.impl.GreetInEnglish;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.time.LocalDate;

@Configuration
public class ApplicationConfiguration {


//    @Bean
//    public Test getTestObj(){
//        Test test= new Test();
//        test.setGreetService(getGreetInEnglishObj());
//        return test;
//    }
    @Bean
    public Test getTestObj(@Qualifier("greetInHindi") GreetService greetService){
        Test test= new Test();
        test.setGreetService(greetService);
        return test;
    }

//    @Bean
//    public GreetInEnglish getGreetInEnglishObj(){
//        return new GreetInEnglish();
//    }


}
