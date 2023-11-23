package in.ineuron.config;

import org.springframework.context.annotation.*;

import java.time.LocalDate;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public LocalDate getDataObj(){

        return LocalDate.now();
    }


}
