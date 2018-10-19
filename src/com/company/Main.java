package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // create an ArrayList to store all persons
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Lora", "Smirnova", "female"));
        persons.add(new Person("Irina", "Soboleva", "female"));
        persons.add(new Person("Seon", "Smith", "male"));
        persons.add(new Person("Noah", "March", "male"));
        persons.add(new Person("Erick", "Stark", "male"));
        persons.add(new Person("Emily", "Sanders", "female"));

        for (int i = 0; i < 10; i++) {
            int randomIndex1 = new Random().nextInt(persons.size());
            Person person1 = persons.get(randomIndex1);

            int randomIndex2 = new Random().nextInt(persons.size());
            Person person2 = persons.get(randomIndex2);
            System.out.println(person1 + " -> " + person2);

            if (person1.equals(person2)) {
                System.out.println(person1 + " is free on Saturday night!");
                continue;
            }

            person1.dateWith(person2);
            person2.dateWith(person1);
        }
        System.out.println("--------List dating persons---------");
        for (Person eachPerson : persons) {
            System.out.println(eachPerson);
            //  System.out.println("   - " + eachPerson.getDated().size());
            HashMap<Person, Integer> counts = new HashMap<>();
            for (Person partner : eachPerson.getDated()) {
                if (counts.containsKey(partner)) {
                    int newCount = counts.get(partner) + 1;
                    counts.put(partner, newCount);
                } else {
                    counts.put(partner, 1);
                }
            }
            System.out.println("   - " + counts);
        }
    }


}
