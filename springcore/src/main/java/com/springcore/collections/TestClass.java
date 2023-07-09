package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
public static void main(String args[]) {
	ApplicationContext conext= new ClassPathXmlApplicationContext("com/springcore/collections/config2.xml");
	Emp emp1= (Emp)conext.getBean("emp1");
	System.out.println(emp1);
	System.out.println(emp1.getPhones().getClass().getName());
	
}
}
