package com.bekov.receiver_user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User  {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String fullName;
    @Column
    private int number;


    public User(String str){
        this(str.split(",")[0].trim(),str.split(",")[1].trim());
    }

    public User( String fullName, String number) {
        this.fullName = fullName;
        this.number = Integer.parseInt(number);
    }

    public User(int id, String fullName, int number) {
        this.id = id;
        this.fullName = fullName;
        this.number = number;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return id + "-> " + fullName + "->" + number;
    }
}
