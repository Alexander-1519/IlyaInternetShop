package com.rybak.service;

import com.rybak.entity.User;

public class UserService {

    public User getById(Long id) {
        System.out.println("getting by id from db...");
        return new User(id);
    }
}
