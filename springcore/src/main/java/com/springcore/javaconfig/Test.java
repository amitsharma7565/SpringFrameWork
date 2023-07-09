package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

//		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/javaconfig/config1.xml");
//		Student st= context.getBean("student", Student.class);
//		System.out.println(st);
		
	ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
	Student st=	context.getBean("temp", Student.class);
	System.out.println(st);
	st.study();

	}

}
