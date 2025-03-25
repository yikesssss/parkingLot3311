class ClientUserFactory extends UserAbstractFactory {
    public User createUser(String userType, String email, String username, String password) {
        switch (userType) {
            case "Student": return new Student(email, username, password);
            case "Faculty": return new Faculty(email, username, password);
            case "Visitor": return new Visitor(email, username, password);
            default: throw new IllegalArgumentException("Invalid user type");
        }
    }
}
