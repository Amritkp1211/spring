package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {

	public static void main(String[] args) {
		
		AbstractApplicationContext a=new ClassPathXmlApplicationContext("com/springcore/lifecycle/samosa.xml");
		Pepsi p=(Pepsi) a.getBean("p1");
        System.out.println(p);
        a.registerShutdownHook();
        
          
	}

}
