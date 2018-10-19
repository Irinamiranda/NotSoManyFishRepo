package com.company;

import java.util.ArrayList;

public class Person {

    private String firstName;
    private String lastName;
    private String sex;
    private ArrayList<Person> dated = new ArrayList<>();

    public ArrayList<Person> getDated() {
        return dated;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public void dateWith(Person person){
        dated.add(person);
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
