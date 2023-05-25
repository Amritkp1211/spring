package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a=new ClassPathXmlApplicationContext("Student.xml");
          Student s=(Student) a.getBean("s1");
          System.out.println(s);
    }
}
