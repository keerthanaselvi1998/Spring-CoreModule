package com.cts.controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Account;
import com.cts.model.Employee;

public class EmployeeController {

	private static ClassPathXmlApplicationContext context;

	public static void main(String args[])
	{
		context = new ClassPathXmlApplicationContext("spring-config.xml");
		Object obj=context.getBean("emp");
		Employee e=(Employee)obj;
		Account ac=e.getAccount();
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Employee Id: "+e.getId());
		System.out.println("Employee salary: "+e.getSalary());
		System.out.println("Employee gender: "+e.getGender());
		System.out.println("Mobile Number : "+e.getMobileNumber());
		System.out.println("acc no:"+ac.getAccountHolder());
		
	}
}