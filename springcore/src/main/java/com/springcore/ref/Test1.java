package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext conext= new ClassPathXmlApplicationContext("com/springcore/ref/config3.xml");
	A temp=	(A)conext.getBean("aref");
	System.out.println(temp);

	}

}
