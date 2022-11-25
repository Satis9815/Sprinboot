package org.example.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("referenceConfig.xml");
        objA temp= (objA) context.getBean("refA");
        System.out.println(temp.getX());
        System.out.println(temp.getObj());
        System.out.println(temp);
    }
}
