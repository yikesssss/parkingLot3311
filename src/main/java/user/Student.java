package user;

public class Student extends UserConcrete{
	public Student(String email, String username, String password) {
        super(email, username, password, "Student");
    }

}
