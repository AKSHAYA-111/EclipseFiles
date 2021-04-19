package com.cts.model;

public class CustomerFactory {
	Customer customer=null;
	
	public Customer createCustomer()
	{
		if(customer==null)
		{
			customer=new Customer();
			customer.setCustomerId(1);
			customer.setCustomerName("AKSHAYA");
			customer.setCustomerSalary(1000000);
		}
		return customer;
	}
	

}
