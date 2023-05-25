package com.springcore.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {
    public static void main(String[] args) {
		
      ApplicationContext a=	new ClassPathXmlApplicationContext("com/springcore/standaloneCollections/Scollections.xml");
       Person p=(Person) a.getBean("p1");
       System.out.println(p.getFees().getClass().getName());
       System.out.println(p);
	}
}
