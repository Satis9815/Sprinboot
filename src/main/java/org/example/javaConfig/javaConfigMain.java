package org.example.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class javaConfigMain {
    public static void main(String[] args) {
        System.out.println("Removing xml... ");
        ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
        Employee emp=context.getBean("getEmployee",Employee.class);
        System.out.println(emp);
        emp.work();
    }
}
