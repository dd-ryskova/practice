package ru.ssau.tk.DDRyskovaCo.practice.DataType;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 5218025673889443483L;

    private String firstName;
    private String lastName;
    private int passportId;
    private Gender gender;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.passportId = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = 0;
    }

    public Person(int passportId) {
        this.firstName = "";
        this.lastName = "";
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}





