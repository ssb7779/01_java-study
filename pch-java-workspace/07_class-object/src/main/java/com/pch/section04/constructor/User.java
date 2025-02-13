package com.pch.section04.constructor;

import java.util.Date;

public class User {
    private String id;
    private String password;
    private String name;
    private Date enrollDate;

    public User(String name, String password, String id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public User() {
    }

    public User(String id, String password, String name, Date enrollDate) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public User(User otherUser) {
        this(otherUser.id, otherUser.password, otherUser.name, otherUser.enrollDate);
    }
}
