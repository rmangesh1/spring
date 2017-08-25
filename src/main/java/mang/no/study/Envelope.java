package mang.no.study;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by mrana on 24.08.2017.
 */
public class Envelope implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String message;
    private BeanFactory beanFactory;
    private String beanName;

    public Envelope() {
        System.out.println("Constructor");
    }

    public Envelope(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setting messasge");
        this.message = message;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory for : "+message);
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("Bean with name : "+beanName);
    }

    public void destroy() throws Exception {
        System.out.println("Bean Destroyed");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroy finalize");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties are set. Message = " + message);
    }
}
