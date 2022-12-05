package org.example;

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
        JdbcTemplate template= (JdbcTemplate) context.getBean("jdbcTemplate");

//        Insert query
        String query="insert into student(id,name,city) values(?,?,?)";

//        fire the query
        int result=template.update(query,1232,"satis","Jhumka");
        System.out.println("1 number of rows affected");
    }
}
