package comp.prod.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mrana on 04.01.2018.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Envelope envelope = (Envelope) annotationConfigApplicationContext.getBean("speciallyNamedEnvelope");
        System.out.println(envelope);
        annotationConfigApplicationContext.close();
    }
}
