package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("com/springcore/ci/Student.xml");
	    Person p=(Person) a.getBean("person");
	    System.out.println(p);
	}

}
