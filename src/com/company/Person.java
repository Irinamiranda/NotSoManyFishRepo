package com.company;

import java.util.ArrayList;

public class Person {

    private String firstName;
    private String lastName;
    private String sex;

    public Person(String firstName, String lastName, String sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Person() {

    }

    public Person(String name, String Sex){

        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + " Sex: " + getSex();
    }
}
