package org.anudip.model;

public class Customer {
	private int customerId;
	private string customerName;
	
	public Customer() {
		this.customerId=24;
		this.customerName='ritik';
		System.out.println("customer without parameter");
	}
	public Customer(int id,String name) {
		this.customerId=Id;
		this.customerName=name;
		System.out.println(customer with parameter);
	}
	public void setcustomerId(int Id) {
		this.customerId=Id;
	}
	public int getcustomerId() {
		return customerId;
	}
	
	public void setcustomerName(String name) {
		this.customerName=name;
	}
	public String getcustomerName() {
		return customerName;
	}

}
