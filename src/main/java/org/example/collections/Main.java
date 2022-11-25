package org.example.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello employee class demonstration");
        ApplicationContext context = new ClassPathXmlApplicationContext("empCollection.xml");
        Emp emp= (Emp) context.getBean("emp1");
        System.out.println(emp.getName());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourses());
    }
}
