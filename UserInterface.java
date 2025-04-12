package com;

interface User {
    void register();
    boolean login(String email, String password);
    boolean validateEmail();
    boolean validatePassword();

    String getEmail();
    String getPassword();
}
