package org.mycompany.model;

public class Employee {
	private int employeeId;
	private char employeeInitial;
	private int employeeSalary;
	
	public Employee() {
		
	}
	
	public Employee(int eId,char eIni, int eSal) {
		employeeId=eId;
		employeeInitial=eIni;
		employeeSalary=eSal;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		employeeId=employeeId;
	}
	public char getEmployeeInitial() {
		return employeeInitial;
	}
	public void setEmployeeInitial(char employeeInitial) {
		employeeInitial=employeeInitial;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		employeeSalary=employeeSalary;
	}

}
