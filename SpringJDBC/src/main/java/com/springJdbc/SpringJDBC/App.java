package com.springJdbc.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.SpringJDBC.dao.StudentDao;
import com.springJdbc.SpringJDBC.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println("My program Start");
       ApplicationContext a=new ClassPathXmlApplicationContext("com/springJdbc/SpringJDBC/jdbc.xml");
          
       StudentDao studentDao = a.getBean("studentDao",StudentDao.class);
       
       
		/*Insert
		 * Student student=new Student(); student.setId(2); student.setName("nitin");
		 * student.setCity("rampura"); int r = studentDao.insert(student);
		 * System.out.println("done...................... "+r);
		 */
       
		/*//update
		 * Student student =new Student(); student.setId(1);
		 * student.setName("Himanshu"); student.setCity("surat");
		 * 
		 * int i = studentDao.update(student);
		 * System.out.println("update successfully  "+i);
		 */
       
       int d = studentDao.delete(2);
       System.out.println("delte successfully"+d);
       
       
    }
}
