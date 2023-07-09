package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	Person p= (Person)context.getBean("person");
	Addition a=(Addition)context.getBean("add");
	a.doSum();
//	System.out.println(a);

	}

}
