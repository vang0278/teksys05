package main;

public class Manager extends Employee {
	
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
	
	

}
