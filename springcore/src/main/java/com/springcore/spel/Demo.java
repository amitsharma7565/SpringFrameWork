package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
@Value("#{2+5}")
private int x;
@Value("#{1}")
private int y;
// to call the static method
@Value("#{T(java.lang.Math).sqrt(144)}")
private double z;
public double getPi() {
	return pi;
}
public void setPi(double pi) {
	this.pi = pi;
}
@Value("#{T(java.lang.Math).E}")
private double e;
@Value("#{T(java.lang.Math).PI}")
private double pi;
// here we are calling to object
@Value("#{new java.lang.String('Amit sharma')}")
private String name;


// work with boolean 
@Value("#{8<3}")
private boolean isActive;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public double getZ() {
	return z;
}
public void setZ(double z) {
	this.z = z;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
			+ isActive + "]";
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}






}
