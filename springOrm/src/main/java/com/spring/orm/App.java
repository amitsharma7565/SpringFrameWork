package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
//        Student student = new Student(001,"delete","hojayegadelete");
//      int r=  studentDao.insert(student);
//        System.out.println("Done"+r);
//        Student student2 = studentDao.getStudent(235);
//        System.out.println(student2);
//        List<Student> allStudent = studentDao.getAllStudent();
//        for(Student st:allStudent) {
//        	System.out.println(st);
//        }
//         studentDao.deleteStudent(001);
        
        Student student = new Student(235,"Pallu","Ghumarwin");
        studentDao.updateStudent(student);
        
        
    }
}
