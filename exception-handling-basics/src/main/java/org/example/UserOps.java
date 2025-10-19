package org.example;

public class UserOps {
    public static void getUser() throws UserNotFoundException {
        throw new UserNotFoundException("User is not found");
    }
}
