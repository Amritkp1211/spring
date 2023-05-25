package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.enities.Student;

public class StudentDao {
    
	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

     @Transactional
	public int Insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
     @Transactional
     public List<Student> getAllStudent(){
    	 List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
     }
     @Transactional
     public Student getStudent(int studentId) {
    	 return this.hibernateTemplate.get(Student.class,studentId);
    	
     }
     @Transactional
     public void update(Student student) {
    	 this.hibernateTemplate.update(student);
     }
     
     @Transactional
     public void delete(int studentId) {
    	 Student student = this.hibernateTemplate.get(Student.class, studentId);
    	  this.hibernateTemplate.delete(student);
     }
}
