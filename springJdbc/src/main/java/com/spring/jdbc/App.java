package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Entity.Student;
import com.spring.jdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program start" );
//        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        if you using java config file not config.xml file then use this below
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao bean = context.getBean("studentDao", StudentDao.class);
//        data insert
//        Student student= new Student();
//        student.setId(799);
//        student.setName("Vinay");
//        student.setCity("bhaulti");
//        int insert = bean.insert(student);
//        System.out.println("Student added"+insert);
              
//        data update
//        Student student= new Student();
//        student.setId(699);
//        student.setName("Vishal Thakur");
//        student.setCity("Mohi");
//         int result= bean.chnage(student);
//         System.out.println("Data changes"+result);
            
//        data delete
//        Student student = new Student();
//        student.setId(222);
//       int result= bean.remove(student);
//       System.out.println("data delete sucessFully"+result);
        
      
//        Student student=bean.getStudent(456);
//        System.out.println(student);
        
       List<Student> std= bean.getAllStudents();
       System.out.println(std);
    }
}
