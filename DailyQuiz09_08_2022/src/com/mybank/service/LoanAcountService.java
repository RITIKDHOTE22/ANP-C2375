package com.mybank.service;

public class LoanAcountService {
	private int loanId,loanAmount,rateOfIntrest,timeperiod;
	public double calculateIntrest(int id,int amount,int roi,int time) {
	double intrest=(amount*roi*time)/100;
		return intrest;
	}

}
