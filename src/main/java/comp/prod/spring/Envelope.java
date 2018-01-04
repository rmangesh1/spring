package comp.prod.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by mrana on 04.01.2018.
 */
public class Envelope implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean {

    private String message;

    public Envelope() {
        System.out.println("No-arg constructor");
    }

    public Envelope(String message) {
        System.out.println("Arg constructor");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setter injection");
        this.message = message;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Set bean factory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name = "+s);
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Disposable beans destroy");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBeans afterpropertiesset");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("set application context");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Envelope{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
