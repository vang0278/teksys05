package main;

public class Main {

	public static void main(String[] args) {
		Employee empOne = new Employee("John", "Smith", 12345, "Sales");
		Employee empTwo = new Employee("Mark", "Smith", 4322, "Sales");
		
		Manager managerOne = new Manager("Bob","Doe",4533,"Manager", "Sales Timecards");
		
		System.out.println(empOne);
		System.out.println(empTwo);

		System.out.println(managerOne);
		System.out.println(managerOne.getFirstName());

	}
	
	

}
