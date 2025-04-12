package com;
abstract class UserAbstractFactory {
    abstract User createUser(String userType, String email, String username, String password);
}
