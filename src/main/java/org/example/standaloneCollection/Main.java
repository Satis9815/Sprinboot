package org.example.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello stand alone collection tutorial");
        ApplicationContext context= new ClassPathXmlApplicationContext("standAloneConfig.xml");
        Employee emp=context.getBean("emp",Employee.class);
        System.out.println(emp);

    }
}
