package mang.no.study;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mrana on 25.08.2017.
 */
public class AppJavaConfig extends RouteBuilder {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Envelope envelope = (Envelope) applicationContext.getBean("envelope");
        System.out.println(envelope.getMessage());


    }

    public void configure() throws Exception {
    }
}
