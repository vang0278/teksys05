package libraryUsers;

public interface LibraryUser {
	boolean registerAccount();
	boolean requestBook() throws ExceptionAgeRestriction;

}
