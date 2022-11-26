package org.example.autowireusingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("autowireAnnotaionConfig.xml");

//        Laptop lap1=context.getBean("dellLap",Laptop.class);
//        System.out.println(lap1);
        Laptop lap2=context.getBean("hp", Laptop.class);
        System.out.println(lap2);


    }
}
