package view;

import service.Service;

public class Main {
	public static void main(String[] args) {
		Service obj=new Service();
		
		System.out.println(obj.calculateSum(21));
		System.out.println(obj.calculateDifference(5));
		System.out.println(obj.checkNumber(21558));
		System.out.println(obj.checkNum(9));

	}

}
