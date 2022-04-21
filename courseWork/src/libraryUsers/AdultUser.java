package libraryUsers;

public class AdultUser implements LibraryUser {
	private int age;
	private String bookType;

	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public boolean registerAccount() {
		if (this.age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
			return true;
		} else if (this.age < 12)
			System.out.println("Sorry, Age must be greater than 12 to register as a adult");

		return false;
	}

	@Override
	public boolean requestBook() {
		if (this.bookType.compareToIgnoreCase("Fiction") == 0) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
			return true;
		} else
			System.out.println("Oops, you are allowed to take only adult Fiction books");

		return false;
	}

}
