package user;

public abstract class UserAbstractFactory {
	public abstract User createUser(String userType, String email, String username, String password);
}
