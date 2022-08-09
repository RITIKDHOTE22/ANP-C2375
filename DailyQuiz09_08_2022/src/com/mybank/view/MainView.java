package com.mybank.view;
import com.mybank.service.LoanAcountService;
public class MainView {
	public static void main(String[]args) {
		LoanAcountService loanAcountServiceobj=new LoanAcountService();
		double intrest=loanAcountServiceobj.calculateIntrest(2,5000,3,6);
		System.out.println(intrest);
	}

}
