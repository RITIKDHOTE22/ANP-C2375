package org.model;

public class Employee {
	private int employeeId,employeeSalary,employeeExperience;
	private char employeeInitial;
	
	public Employee() {
		
	}
	
	public Employee(int empId,char empInitial,int empSal, int empExperience) {
		employeeId=empId;
		employeeInitial=empInitial;
		employeeSalary=empSal;
		employeeExperience=empExperience;
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
	public int getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(int employeeExperience) {
		employeeExperience=employeeExperience;
	}

}
