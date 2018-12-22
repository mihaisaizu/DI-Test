package com.mihaisaizu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class LifeCycleBeanSim implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleBeanSim() {
        System.out.println("## I'm in the LifeCycleBeanSimulation Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle of this bean has bean terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## This LifeCycleBeanSim has it's properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The @PostConstruct method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The @PreDestroy method has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After Init - Called by Bean Post Processor");
    }
}
