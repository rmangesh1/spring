package mang.no.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mrana on 25.08.2017.
 */
@Configuration
public class SpringConfig {

    @Bean
    public Envelope envelope() {
        return new Envelope(message());
    }

    @Bean
    public String message() {
        return "JavaConfigMangesh";
    }
}
