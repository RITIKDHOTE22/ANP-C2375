package question2;

public class Loop {
	public static void main(String[] args) {
		int number=1;
		
		for (int i=1;i<8;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" "+number*j);
			}
		}
		
		System.out.println();
		number++;

	}

}
