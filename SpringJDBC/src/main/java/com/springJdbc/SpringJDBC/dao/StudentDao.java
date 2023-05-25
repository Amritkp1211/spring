package com.springJdbc.SpringJDBC.dao;

import com.springJdbc.SpringJDBC.entities.Student;

public interface StudentDao {  
	
   public int insert(Student student); 
   
   public int update(Student student);
   
   public int delete(int studentID);
   
}
