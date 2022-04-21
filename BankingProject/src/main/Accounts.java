package main;

//implicit -->> public static final
enum AccountTypes {
	CHECKING, SAVINGS, CREDIT
}

public class Accounts {

	// ref of the emun
	AccountTypes acountTypes;

	// class constructor
	public Accounts(AccountTypes acountTypes) {
		super();
		this.acountTypes = acountTypes;
	}

	// method to chose account types
	public void choseAccount() {
		switch (this.acountTypes) {
		case CHECKING:
			System.out.println("You chose Checking");
			break;
		case SAVINGS:
			System.out.println("You chose Savings");
			break;
		case CREDIT:
			System.out.println("You chose Credit");
			break;
		}
	}

}
