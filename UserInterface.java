interface User {
    void register();
    boolean login(String email, String password);
    boolean validateEmail();
    boolean validatePassword();
}
