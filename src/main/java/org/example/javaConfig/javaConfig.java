package org.example.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.example.javaConfig")
public class javaConfig {
    @Bean
    public  Name getName(){
        return  new Name();
    }
    @Bean(name = {"employee","temp","emp"})
    public Employee getEmployee(){
//        Creating a new student object
        Employee employee=new Employee(getName());
        return  employee;
    }

}
