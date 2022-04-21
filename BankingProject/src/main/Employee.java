package main;

public class Employee extends AbstractAccountActions {

	// Fields (public default)
	private String firstName;
	private String lastName;
	private long employeeId;
	private String jobTitle;
//	protected 
//	public
//	private
	private float totalAmount;

	public Employee() {

	}

	public Employee(String firstName, String lastName, long employeeId, String jobTitle) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}

	public Employee(String firstName, String lastName, long employeeId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
//		this.jobTitle = jobTitle;
	}

	public Employee(String firstName, long employeeId) {
		super();
		this.firstName = firstName;
//		this.lastName = lastName;
		this.employeeId = employeeId;
//		this.jobTitle = jobTitle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [" //
				+ "firstName=" + firstName //
				+ ", lastName=" + lastName //
				+ ", employeeId=" + employeeId //
				+ ", jobTitle=" + jobTitle //
				+ "]";
	}

	// other methods
	@Override
	float withdraw(int amount, int withdrawAmount) {
		this.totalAmount = amount - withdrawAmount;
		return this.totalAmount;
	}

	@Override
	float deposit(int amount, int depositAmount) {
		this.totalAmount = amount + depositAmount;
		return 0;
	}

}
