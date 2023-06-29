package com.rima.springdemo.student;

import java.security.PrivateKey;
import java.time.LocalDate;

public class Student {

    private String firstname;


    private String lastname;

    private int age;

    private LocalDate dateOfBirth;

    private String email;


    public Student(String firstname, String lastname, int age, LocalDate dateOfBirth, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
