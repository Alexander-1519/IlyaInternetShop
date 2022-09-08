package com.rybak;

import com.rybak.entity.User;
import com.rybak.service.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        User userById = userService.getById(5L);

        System.out.println("userById = " + userById);
    }
}
