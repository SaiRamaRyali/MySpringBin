package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Account;



public class App {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Account account = (Account)context.getBean("account");

		System.out.println(account);

	}

}
