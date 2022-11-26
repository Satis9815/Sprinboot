package org.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public Example(String subject) {
        this.subject = subject;
    }

    public Example() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @PostConstruct
    public void  start(){
        System.out.println("Start funtion calling...");
    }
    @PreDestroy
    public void  end(){
        System.out.println("end function calling...");
    }
}
