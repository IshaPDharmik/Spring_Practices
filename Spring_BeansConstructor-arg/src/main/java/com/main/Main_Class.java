package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.Students;

public class Main_Class {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Students s = context.getBean("stud", Students.class);
		Country c = context.getBean("con", Country.class);
		System.out.println(s);

	}

}
