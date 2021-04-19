package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cts.model.Employee;
import com.cts.model.Book;

public class BookMain {
	
	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		
		Book b= (Book)beanFactory.getBean("bk1");
		Employee emp= (Employee)beanFactory.getBean("emp1");
		System.out.println(b);
		System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpSalary());
		
		
		
	}

}