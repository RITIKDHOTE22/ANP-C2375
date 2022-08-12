package org.view;
import org.model.Employee;
import org.service.EmployeeService;

public class EmployeeView {
	public static void main(String[] args) {
		Employee employee1=new Employee(2,'R',2500,4);
		EmployeeService empService=new EmployeeService();
		boolean value=empService.isEligibleForIncrement(employee1);
		System.out.println(value);
	}

}
