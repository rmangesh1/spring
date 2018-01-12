package mang.no.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mrana on 09.11.2017.
 */
public class SpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Envelope envelope = (Envelope) classPathXmlApplicationContext.getBean("envelope");
        //Envelope envelope1 = (Envelope) envelope.getBeanFactory().getBean("envelope1");
        //System.out.println("Message from envelope by getting envelope1 : "+envelope1.getMessage());
        classPathXmlApplicationContext.close();
    }
}
