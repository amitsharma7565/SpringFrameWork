package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StundetDaoImpl;

@Configuration
@ComponentScan(basePackages ={"com.spring.jdbc.dao"})
public class JdbcConfig {
	@Bean("ds")
	public DriverManagerDataSource getSource() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplete() {
	JdbcTemplate jdbcTemplate= new JdbcTemplate();
	jdbcTemplate.setDataSource(getSource());
	return jdbcTemplate;
	}
	
//	@Bean("studentDao")
//	public StudentDao getStudent() {
//		StundetDaoImpl studentDao= new StundetDaoImpl();
//		studentDao.setJdbcTemplete(getTemplete());
//		return studentDao;
//		
//	}
}
