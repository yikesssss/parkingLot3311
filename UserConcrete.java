class UserConcrete implements User {
    protected String email;
    protected String username;
    protected String password;
    protected String userType;

    public UserConcrete(String email, String username, String password, String userType) {
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

