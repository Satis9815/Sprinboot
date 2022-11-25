package org.example.springBootTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public  static void main(String args[]){
        System.out.println("Welcome to the springBoot Class");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student= (Student) context.getBean("student1");
        Student student2= (Student) context.getBean("student2");
//        System.out.println(student);
        System.out.println(student2);

        
    }
}
