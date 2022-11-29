package org.example.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoMain {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("stereotypeAnnotationConfig.xml");
        Student student= context.getBean("obj",Student.class);
        SpringExpressionLang spEL= context.getBean("sp",SpringExpressionLang.class);
        System.out.println(student.hashCode());
        System.out.println(spEL);
    }
}
