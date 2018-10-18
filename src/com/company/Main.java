package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //create an ArrayList to store persons
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Lora", "Smirnova", "female"));
        persons.add(new Person("Irina", "Soboleva", "female"));
        persons.add(new Person("Seon", "Smith", "male"));
        persons.add(new Person("Noah", "March", "male"));
        persons.add(new Person("Erick", "Stark", "male"));
        persons.add(new Person("Emily", "Sanders", "female"));


        ArrayList<Person> datingPersons = new ArrayList<>();
        ArrayList<Person> men = new ArrayList<>();
        ArrayList<Person> women = new ArrayList<>();

        for (int i = 0; i < 3; i++){

            int randomIndex1 = new Random().nextInt(persons.size());
            Person person1 = persons.get(randomIndex1);

            int randomIndex2 = new Random().nextInt(persons.size());
            Person person2 = persons.get(randomIndex2);

            if (person1.getSex() != person2.getSex()){
                System.out.println("Person1: " + person1 + "\n" + "Person2: " + person2);
                System.out.println("-------Date!!!---------");
                datingPersons.add(person1);
                datingPersons.add(person2);

            }

            else if(person1.getSex() == person2.getSex()){
                System.out.println("Person1: " + person1 + "\n" + "Person2: " + person2);
                System.out.println("-----Try again!-------");
            }
            else {
                break;
            }

        }
        System.out.println("--------List dating persons---------");
        for(Person eachPerson: datingPersons){
            System.out.println(eachPerson);
        }







    }

}
