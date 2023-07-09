package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

public class StudentDao {
	
	private  HibernateTemplate hibernateTemplate;
	@Transactional
public int insert(Student student) {
	Integer i=(Integer)this.hibernateTemplate.save(student);
	return i;
}
	
	//get the single object 
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
//	get all the object
	public List<Student> getAllStudent(){
		List<Student> loadAll = this.hibernateTemplate.loadAll(Student.class);
		return loadAll;
	}
	
//	delete the id
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class,studentId);{
			this.hibernateTemplate.delete(student);
			System.out.println("deleled succesully");
		}
	}
	
	// updating the data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
		System.out.println("update sucessfully");
	}
	
	
public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}
public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

}
