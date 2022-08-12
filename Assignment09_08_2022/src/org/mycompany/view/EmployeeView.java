package org.mycompany.view;
import org.mycompany.model.Employee;
import org.mycompany.service.EmployeeService;

public class EmployeeView {
	public static void main(String[] args) {
		
		Employee Employee1 = new Employee(22,'R',22000);		
		EmployeeService EmployeeSer1 = new EmployeeService();
		System.out.println("Employee Old salary: "+ Employee1.getEmployeeSalary());
		Employee UpdatedSalary= EmployeeSer1.calculateSalaryIncrement(Employee1);
		System.out.println("Employee Id: "+ UpdatedSalary.getEmployeeId());
		System.out.println("Employee Initial :"+UpdatedSalary.getEmployeeInitial());
		System.out.println("Employee Updated Salary :"+UpdatedSalary.getEmployeeSalary());
	}
}