package org.example.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycleConfig.xml");
        Phone iPhone=(Phone) context.getBean("iPhone");
        System.out.println(iPhone);
        //register shutdown hook for calling the destroy function 
        context.registerShutdownHook();
    }
}
