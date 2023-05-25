package com.springcore.standaloneCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
   
	@Override
	public String toString() {
		return "Person [courses=" + courses + ", fees=" + fees + ", properties=" + properties + "]";
	}
	private List<String> courses;
	private Map<String, Integer> fees;
	private Properties properties;
	public List<String> getCourses() {
		return courses;
	}
	
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public Map<String, Integer> getFees() {
		return fees;
	}
	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
	}
