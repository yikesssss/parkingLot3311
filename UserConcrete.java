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
        Database db = Database.getInstance("users.csv");
        
        
        for (User u : db.users) {
            if (u.email.equals(this.email)) {
                System.out.println("Error: Email already registered.");
                return;
            }
        }

        db.users.add(this);
        try {
            db.update("users.csv");
            System.out.println(userType + " account successfully registered: " + email);
        } catch (Exception e) {
            System.out.println("Error registering user: " + e.getMessage());
        }
    }

    public boolean login(String email, String password) {
        Database db = Database.getInstance("users.csv");

        for (User u : db.users) {
            if (u.email.equals(email) && u.password.equals(password)) {
                System.out.println("Login successful: " + email);
                return true;
            }
        }

        System.out.println("Login failed: Invalid email or password.");
        return false;
    }
    public boolean validateEmail() {
        return email.contains("@");
    }

    public boolean validatePassword() {
        return password.length() >= 6;
    }
}

