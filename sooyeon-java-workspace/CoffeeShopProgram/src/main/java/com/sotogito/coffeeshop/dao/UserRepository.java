package com.sotogito.coffeeshop.dao;

import com.sotogito.coffeeshop.model.User;

import java.util.*;

public class UserRepository {
    private final Set<User> users = new HashSet<>();

    public void addUser(User user) {
        users.add(user);
    }

    public Optional<User> findByIdAndPassword(String id, String password) {
        return users.stream()
                .filter(user -> user.getId().equals(id) && user.getPassword().equals(password))
                .findAny();
    }

}
