package question1.model;

public class Customer {
	private int Id,Age;
	private String Name;
	
	public Customer() {
		
	}
	public Customer(int Id, String Name, int Age) {
		this.Id=Id;
		this.Name=Name;
		this.Age=Age;
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id=Id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}

}
