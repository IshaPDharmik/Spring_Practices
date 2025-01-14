package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Login;
import com.entity.Register;

public class Main_Class {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Register R = context.getBean("Reg", Register.class);
		Login L = context.getBean("lg", Login.class);
		System.out.println(R);

	}

}
