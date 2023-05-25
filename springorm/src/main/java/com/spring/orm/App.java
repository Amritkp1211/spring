package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.enities.Student;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext a=new  ClassPathXmlApplicationContext("orm.xml");
     StudentDao studentDao = a.getBean("studentDao",StudentDao.class);
		/*
		 * Student student=new Student(1, "Amrit","Sindrath");
		 * 
		 * int result = studentDao.Insert(student);
		 * System.out.println("record inserted successfully "+result);
		 */
       boolean go=true;
     while(true) {
    	 try {
    		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	     System.out.println("1.add Student");
    	     System.out.println("2.get All the Students");
    	     System.out.println("3. Get one student");
    	     System.out.println("4. Delete");
    	     System.out.println("5. Update");
    	     System.out.println("6. Exit");
    	     
    	     int input = Integer.parseInt(br.readLine());
    		 
    	     switch (input) {
			case 1:
				//add
				System.out.println("Enter user id: ");
				int uID=Integer.parseInt(br.readLine());
				System.out.println("Enter userName: ");
				String uName=br.readLine();
				System.out.println("Enter user City: ");
				String uCity=br.readLine();
				
				Student s=new Student(uID, uName, uCity);
				   int i = studentDao.Insert(s);
				   System.out.println(i+" record inserted");
				   System.out.println("-----------------------------------------");
				break;
			case 2:
				//All Students
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
				List<Student> sl = studentDao.getAllStudent();
				   for(Student S : sl) {
					   System.out.println("ID: "+S.getId());
					   System.out.println("NAME :"+S.getName());
					   System.out.println("City : "+S.getCity());
					   
				   }
				   System.out.println("+++++++++++++++++++++++++++++++++++++++++++=");
				break;
			case 3:
				System.out.println("Enter user id: ");
				int sID=Integer.parseInt(br.readLine());
				Student student = studentDao.getStudent(sID);
				System.out.println("ID: "+student.getId());
				   System.out.println("NAME :"+student.getName());
				   System.out.println("City : "+student.getCity());
				   System.out.println("+++++++++++++++++++++++++++++++++++++++++++=");
				break;
			case 4:
				//delete
				System.out.println("Enter user id: ");
				int dID=Integer.parseInt(br.readLine());
				studentDao.delete(dID);
				System.out.println("delete succefully");
				System.out.println("================================================");
				
				break;
			case 5:
				//update
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("Enter user id: ");
				int upID=Integer.parseInt(br.readLine());
				System.out.println("Enter userName: ");
				String upName=br.readLine();
				System.out.println("Enter user City: ");
				String upCity=br.readLine();
				
				Student su=new Student(upID, upName, upCity);
				   studentDao.update(su);
				   System.out.println(" record inserted");
				   System.out.println("-----------------------------------------");
				break;
			case 6:
				//exit
				go=false;
				break;
			   
			}
    	     
		} catch (Exception e) {
			System.out.println("Invalid input Try with Another One");
			System.out.println(e.getMessage());
		}
    	 
     }
     
    }
}
