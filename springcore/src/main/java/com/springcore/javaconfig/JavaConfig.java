package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
//if we are using bean no use of compoentScan
public class JavaConfig {
	@Bean
	public Samosa getSomsa() {
		Samosa samosa = new Samosa();
		return samosa;
	}
	
	
	@Bean(name= {"student","temp","com"})
//	here you can get this object by any name
 public Student getStudent() {
//	 creating new object
	 Student student= new Student(getSomsa());
	 return student;
 }
}
