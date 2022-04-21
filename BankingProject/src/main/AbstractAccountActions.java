package main;

public abstract class AbstractAccountActions {

	private String bankAccount;

	// default constructor
	public AbstractAccountActions() {
//		System.out.println("default Constructor");
	}

	public AbstractAccountActions(String bankAccount) {
//		System.out.println("default Constructor---string");
		this.bankAccount = bankAccount;
	}

	// no method body -- abstract
	abstract float withdraw(int amount, int withdrawAmount);

	abstract float deposit(int amount, int depositAmount);

	public String getBankAccount() {
		return bankAccount;
	}

}
