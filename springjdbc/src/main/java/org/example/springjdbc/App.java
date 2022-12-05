package org.example.springjdbc;

import org.example.entity.Student;
import org.example.springjdbcDbO.StudentInterFace;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //spring jdbc=>jdbcTemplate
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentInterFace studentInterFace=context.getBean("studentInterFace",StudentInterFace.class);

        Student student=new Student();
        student.setId(111);
        student.setName("Ram");
        student.setCity("Kathmandu");
        int result=studentInterFace.insert(student);
        System.out.println("Student added "+result);
    }
}
