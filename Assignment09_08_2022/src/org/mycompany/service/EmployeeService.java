package org.mycompany.service;
import org.mycompany.model.Employee;

public class EmployeeService {
	public Employee calculateSalaryIncrement(Employee obj1) {
	    int incrementedSal=(obj1.getEmployeeSalary()+(obj1.getEmployeeSalary()*25)/100);
		obj1.setEmployeeSalary(incrementedSal);
		return obj1;
	}
}
 