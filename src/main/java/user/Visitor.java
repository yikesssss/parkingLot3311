package user;

public class Visitor extends UserConcrete {

	public Visitor(String email, String username, String password) {
        super(email, username, password, "Visitor");
    }

}
