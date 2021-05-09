package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by developer on 2021-05-09.
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## 01 - I'm in the LifeCycleBean Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 10 - The Lifecycle bean has been terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 07 - The LifeCycleBean has its properties set!");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 03 - Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 02 - My Bean Name is: " + name);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 04 - Application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## 06 - The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 09 - The Predestroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## 05 - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## 08 - After init called by Bean Post Processor");
    }
}

