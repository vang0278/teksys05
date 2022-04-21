package main;

public class Manager extends Employee implements AccountActionsIMPL {

	// fields
	private String timeCards;

	// default constructor
	public Manager() {

	}

	public Manager(String firstName, String lastName, long employeeId, String jobTitle, String timeCards) {
		super(firstName, lastName, employeeId, jobTitle);
		this.timeCards = timeCards;
	}

	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}

	@Override
	public String toString() {
		return "Manager [timeCards=" + timeCards + "]";
	}

	// implements
	@Override
	public void withdraw(float amount, float withdrawAmount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit(float amount, float depositAmount) {
		// TODO Auto-generated method stub

	}

	// variable arguments
	public void printThis(int... val) {
		for (int i : val) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
