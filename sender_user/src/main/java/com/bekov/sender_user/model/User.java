package com.bekov.sender_user.model;

public class User {
    private String fullName;
    private int number;

    public User(String fullName, int number) {
        this.fullName = fullName;
        this.number = number;
    }

    public User() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return fullName +","+ number ;
    }
}
