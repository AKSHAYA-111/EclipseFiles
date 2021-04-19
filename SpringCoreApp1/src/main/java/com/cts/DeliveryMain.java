package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Delivery;

public class DeliveryMain {	
	
	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("application.xml");
		Delivery delivery=beanFactory.getBean("delivery1",Delivery.class);
		
		delivery.setDeliveryId(125);
		delivery.setDeliveryName("book");
		delivery.setDeliveryLocation("chennai");
		
		System.out.println(delivery.getDeliveryId());
		System.out.println(delivery.getDeliveryName());
		System.out.println(delivery.getDeliveryLocation());
		System.out.println();
		
		Delivery delivery1=beanFactory.getBean("delivery1",Delivery.class);
		System.out.println(delivery1.getDeliveryId());
		System.out.println(delivery1.getDeliveryName());
		System.out.println(delivery1.getDeliveryLocation());
		
		System.out.println();
		
		Delivery delivery2=beanFactory.getBean("delivery2",Delivery.class);
		System.out.println(delivery2.getDeliveryId());
		System.out.println(delivery2.getDeliveryName());
		System.out.println(delivery2.getDeliveryLocation());
		
	}
}
