package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("com/springcore/ref/ref.xml");
		  A c=(A) a.getBean("aref");
		  System.out.println(c);
		  System.out.println(c.getOb().getY());

	}

}
