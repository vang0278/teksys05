package libraryUsers;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser[] kids = { new KidUser(10, "Kids"), new KidUser(18, "Fiction") };
		AdultUser[] adults = { new AdultUser(5, "Kids"), new AdultUser(23, "Fiction") };

		System.out.println("kids with IF");
		for (KidUser user : kids) {
			if (user.registerAccount())
				try {
					user.requestBook();
				} catch (ExceptionAgeRestriction e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		System.out.println("kids ALL");
		for (KidUser user : kids) {
			user.registerAccount();
			try {
				user.requestBook();
			} catch (ExceptionAgeRestriction e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("adults with IF");
		for (AdultUser user : adults) {
			if (user.registerAccount())
				try {
					user.requestBook();
				} catch (ExceptionAgeRestriction e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		System.out.println("adults ALL");
		for (AdultUser user : adults) {
			user.registerAccount();
			try {
				user.requestBook();
			} catch (ExceptionAgeRestriction e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
