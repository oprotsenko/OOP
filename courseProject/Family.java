package com.oprotsen.JavaOOP.courseProject;

import java.util.ArrayList;

public class Family {
    private final ArrayList<User> family = new ArrayList<>();

    public void addUser(User user) {
        family.add(user);
    }

    @Override
    public String toString() {
        return "Family{" +
                "family=" + family +
                '}';
    }
}
