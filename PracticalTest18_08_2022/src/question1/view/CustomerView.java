package question1.view;
import question1.model.Customer;
import question1.service.CustomerService;
 public class CustomerView {
	public static void main(String[] args) {
		Customer customer1=new Customer(21,"Ritik",21);
		
		CustomerService isEligible= new CustomerService();
		
		boolean criteria= isEligible.checkEligibility(customer1);
		if(criteria==true)
			System.out.println("You areeligible for voting");
		else
			System.out.println("You are not eligible for voting");

	}
 
}
