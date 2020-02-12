package com.deboing.utils;

import com.deboing.backend.persistence.domain.User;

public class UsersUtils {

    private UsersUtils(){
        throw new AssertionError("Non instaitable");
    }

    public static User createBasicUser(){
        User user = new User();
        user.setUsername("basicUser");
        user.setPassword("secret");
        user.setEmail("basic@gmail.col");
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("1234456789");
        user.setCountry("DRC");
        user.setDescription("A basic user");
        user.setProfileImage("https://blabla.images.com/basicuser");

        return user;
    }

    public static User createMainUser(){
        User user = new User();
        user.setUsername("mainuser");
        user.setPassword("secret");
        user.setEmail("basic@gmail.col");
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("1234456789");
        user.setCountry("DRC");
        user.setDescription("A basic user");
        user.setProfileImage("https://blabla.images.com/basicuser");

        return user;
    }
}
