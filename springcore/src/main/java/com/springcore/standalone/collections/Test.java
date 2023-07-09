package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
	Person	person=con.getBean("person1",Person.class);
	System.out.println(person);
	System.out.println("=============================");
	System.out.println(person.getFriends().getClass().getName());
	System.out.println("=============================");
	System.out.println(person.getFeeStructre().getClass().getName());
	System.out.println("=============================");
	System.out.println(person.getProperties().getClass().getName());

	}

}
