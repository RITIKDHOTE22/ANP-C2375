package question1.service;
import question1.model.Customer;

 public class CustomerService {
	
	public boolean checkEligibility(Customer obj) {
		boolean result= false;
		
		if(obj.getAge()>=18)
			result=true;
		
		return result;

	}

}
