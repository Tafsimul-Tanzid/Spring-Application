package noXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Mid getMidexamdate(){
        return new Mid();
    }
    @Bean
    public Final getFinalexamdate(){
        return new Final();
    }
}