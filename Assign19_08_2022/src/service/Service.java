package service;

public class Service {
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0&& i%5==0)
				sum=sum+i;
		}
			return sum;
	}
	
	public int calculateDifference(int n) {
		int sum1=0,sum2=0;
		
		for(int i=1;i<=n;i++) {
			sum1=sum1+(i*i);
			sum2=sum2+i;
		}
		sum2=sum2*sum2;
		return (sum2-sum1);
	}
	
	public boolean checkNumber(int num){
		int rem;
		int temp=num%10;
		num=num/10;
		while(num>0) {
			rem=num%10;
			num=num/10;
			
			if(rem>temp)
				return false;
			temp=rem;
		}
		return true;
	}
	
	
	public boolean checkNum(int n) {
		if(n%2==0)
			return true;
		return false;
	}

}
