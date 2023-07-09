package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Entity.Student;

// automatically bean deacalare
@Component("studentDao")
public class StundetDaoImpl implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplete;

	public JdbcTemplate getJdbcTemplete() {
		return jdbcTemplete;
	}



	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}



	public int insert(Student student) {
		String query="insert into student(id,name,city) values(?,?,?)";
		int update = jdbcTemplete.update(query,student.getId(),student.getName(),student.getCity());
		return update;
	}



	public int chnage(Student student) {
//		updating data
		String query=" update student set name=?, city=? where id=?";
		int r=this.jdbcTemplete.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}



	public int remove(Student student) {
		String query="delete from student where id=?";
			int r=	this.jdbcTemplete.update(query,student.getId());
	
		return r;
	}


// fetch the data from the database but it's single student
	public Student getStudent(int studentId) {
		String query="select*from student where id=?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student student= this.jdbcTemplete.queryForObject(query, rowMapper,studentId);
		return student;
	}


//// fetch the data from the database but it's mutliple student
	public List<Student> getAllStudents() {
	String query="select*from student";
	RowMapper<Student> rowMapper= new RowMapperImpl();
	List<Student> student= this.jdbcTemplete.query(query, rowMapper);
		return student;
	}

}
