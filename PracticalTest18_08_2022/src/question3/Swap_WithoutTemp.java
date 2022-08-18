package question3;

public class Swap_WithoutTemp {
	public static void main(String[] args) {
		int a=21, b=31;
		System.out.println("before swapping a="+a+"b="+b);
		a=a+b;
		b=a-b;
		a=b-a;
		
		System.out.println("after swapping a="+a+"b="+b);

	}

} 
