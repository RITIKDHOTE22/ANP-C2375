package demo;

public class Demo {
	
  void start() {
	System.out.println("Start");
	
 }
  void displayInstruction() {
		System.out.println("DisplayInstruction");

  }
  void exit() {
		System.out.println("Exit");

  }
  public static void main(String[] args) {
	  int mainInput = 1;
	  Demo demo1= new Demo();
	  switch(mainInput) {
	  case 1: demo1.start ();
	  break;
	  case 2:demo1.displayInstruction();
	  break;
	  case 3: demo1.exit();
	  break;
	  default :
		  System.out.println("invalid choice");
	  
	  }
  }
}
