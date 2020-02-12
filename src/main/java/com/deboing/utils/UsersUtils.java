package com.deboing.utils;

import com.deboing.backend.persistence.domain.User;

public class UsersUtils {

    private UsersUtils(){
        throw new AssertionError("Non instaitable");
    }

    public static User createBasicUser(String username, String password, String email){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("1234456789");
        user.setCountry("DRC");
        user.setDescription("A basic user");
        user.setProfileImage("https://blabla.images.com/basicuser");

        return user;
    }


}
