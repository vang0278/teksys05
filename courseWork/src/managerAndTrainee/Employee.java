package managerAndTrainee;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;

	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}

	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}

	public double calculateSalary() {
		double salary = this.basicSalary + (this.basicSalary * this.specialAllowance / 100)
				+ (this.basicSalary * this.hra / 100);

		System.out.println(salary);
		return salary;
	}

	public double calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = 10 * this.basicSalary / 100;

		System.out.println(transportAllowance);
		return transportAllowance;
	}
}
