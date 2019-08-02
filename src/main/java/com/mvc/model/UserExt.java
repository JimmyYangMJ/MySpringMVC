package com.mvc.model;

public class UserExt {
    private User user;

    @Override
    public String toString() {
        return "UserExt{" +
                "user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
