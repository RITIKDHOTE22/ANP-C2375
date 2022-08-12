package org.service;
import org.model.Employee;

public class EmployeeService {
	public boolean isEligibleForIncrement(Employee emp) {
		boolean result=false;
		int exp=emp.getEmployeeExperience();
		if(exp>2)
		{
			result=true;
		}
		return result;
	}

}
