package mang.no.study;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by mrana on 25.08.2017.
 */
public class PostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Envelope) {
            Envelope envelope = (Envelope) bean;
            System.out.println("postProcessBeforeInitialization. Bean message state = " + envelope.getMessage());
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Envelope) {
            Envelope envelope = (Envelope) bean;
            System.out.println("postProcessAfterInitialization. Bean message state = " + envelope.getMessage());
        }
        return bean;
    }
}
