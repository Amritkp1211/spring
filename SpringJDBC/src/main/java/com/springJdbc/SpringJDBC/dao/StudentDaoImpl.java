package com.springJdbc.SpringJDBC.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.SpringJDBC.entities.Student;

public class StudentDaoImpl implements StudentDao{
		 
	private JdbcTemplate template;
	
	public int insert(Student student) {
		 String query="insert into Student(id,name,city) values(?,?,?)";
		int r = this.template.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int update(Student student) {
		String query="update Student set name=?,city=? where id=?";
		 int result = this.template.update(query,student.getName(),student.getCity(),student.getId());
		  
		return result;
	}
	
	public int delete(int studentID) {
		String query="delete from student where id=?";
		int r = this.template.update(query,studentID);
		return r;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

}
