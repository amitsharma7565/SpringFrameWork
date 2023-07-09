package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor1");
	}
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor2");
	}
	
	public void doSum() {
		System.out.println("value of a"+a);
		System.out.println("value of b"+b);
		System.out.println("Sum is =  "+(this.a+this.b));
	}
	
}
