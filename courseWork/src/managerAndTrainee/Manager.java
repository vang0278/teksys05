package managerAndTrainee;

public class Manager extends Employee {

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = 15 * this.basicSalary / 100;

		System.out.println(transportAllowance);
		return transportAllowance;
	}

}
