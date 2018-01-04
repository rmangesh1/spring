package comp.prod.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mrana on 04.01.2018.
 */
@Configuration
@ComponentScan
public class SpringConfig {

    @Bean(name = "speciallyNamedEnvelope")
    public Envelope envelope() {
        Envelope e = new Envelope();
        e.setMessage("Hello World!");
        return e;
    }

    @Bean
    public PostProcessor postProcessor() {
        return new PostProcessor();
    }

}
