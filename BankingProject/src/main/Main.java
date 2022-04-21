package main;

public class Main {

	public static void main(String[] args) {
		Employee empOne = new Employee("John", "Smith", 12345, "Sales");
		Employee empTwo = new Employee("Mark", "Smith", 4322, "Sales");

		Manager managerOne = new Manager("Bob", "Doe", 4533, "Manager", "Sales Timecards");

		System.out.println(empOne);
		System.out.println(empTwo);

		System.out.println(managerOne);
		System.out.println(managerOne.getFirstName());

		empOne.withdraw(200, 50);

		Box<Integer> intBox = new Box<Integer>();
		intBox.add(234);
		intBox.add(435);
		intBox.add(867);
		intBox.add(678);

		System.out.println(intBox.get());

		Box<String> strBox = new Box<String>();
		strBox.add("Hi");
		strBox.add("Hello");

		System.out.println(strBox.get());

		Box<Employee> eBox = new Box<Employee>();

		managerOne.printThis(1, 5, 4, 3, 6, 7, 9, 12323445, 23453, 235235, 23453, 32523);

		String str = "CHECKING";
		Accounts accOne = new Accounts(AccountTypes.valueOf(str));
		accOne.choseAccount();
		Accounts accTwo = new Accounts(AccountTypes.SAVINGS);
		accTwo.choseAccount();

		ExampleClass.NestedClass.hello();
	}

}
