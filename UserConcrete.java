class BaseUser implements User {
    protected String email;
    protected String username;
    protected String password;
    protected String userType;

    public BaseUser(String email, String username, String password, String userType) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public void register() {
        System.out.println(userType + " account registered: " + email);
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public boolean validateEmail() {
        return email.contains("@");
    }

    public boolean validatePassword() {
        return password.length() >= 6;
    }
}

class Student extends BaseUser {
    public Student(String email, String username, String password) {
        super(email, username, password, "Student");
    }
}

class Faculty extends BaseUser {
    public Faculty(String email, String username, String password) {
        super(email, username, password, "Faculty");
    }
}

class Visitor extends BaseUser {
    public Visitor(String email, String username, String password) {
        super(email, username, password, "Visitor");
    }
}
