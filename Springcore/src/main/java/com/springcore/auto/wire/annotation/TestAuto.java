package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {
   public static void main(String[] args) {
	
	   
	ApplicationContext a=   new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/Auto.xml");
      Emp emp1 =a.getBean("emp1",Emp.class);
        System.out.println(emp1);
   } 
	
}
