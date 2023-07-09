package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[]) {
	ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/sterotype/steroconfig.xml");
	Student std=con.getBean("student",Student.class);
	System.out.println(std);
	System.out.println(std.hashCode());
	ApplicationContext con2= new ClassPathXmlApplicationContext("com/springcore/sterotype/steroconfig.xml");
	Student std2=con2.getBean("student",Student.class);
	System.out.println(std2);
	System.out.println(std2.hashCode());
	
	Teacher t1=con2.getBean("tech",Teacher.class);
	Teacher t2=con2.getBean("tech",Teacher.class);
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
}
}
