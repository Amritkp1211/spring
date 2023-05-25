package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
  private double price;

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public Pepsi(double price) {
	super();
	this.price = price;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting price");
	this.price = price;
}
public void afterPropertiesSet() throws Exception {
	System.out.println("Service destroy");
	
}

public void destroy() throws Exception {
   System.out.println("Service start");	
}


  
}
