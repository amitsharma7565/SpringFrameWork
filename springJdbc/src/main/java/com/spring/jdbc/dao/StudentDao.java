package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.Entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int chnage(Student student);
	public int remove(Student student);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
}
