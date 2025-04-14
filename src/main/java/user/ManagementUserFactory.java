package user;

public class ManagementUserFactory extends UserAbstractFactory {
	public User createUser(String userType, String email, String username, String password) {
        if (userType.equals("Management Team")) {
            return new ManagementTeamMember(email, username, password);
        } else if (userType.equals("Super Manager")) {
            return SuperManager.getInstance();
        }
        throw new IllegalArgumentException("Invalid management user type");
    }

}
