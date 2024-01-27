package mods;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new mods.Employee("Myrzan", "Myrzakhan", "it", 27045.78));
        people.add(new mods.Employee("Alibek", "Kunanbay", "sportsmen", 50000.00));
        people.add(new Student("Marlen", "Bay", 2.5));
        people.add(new Student("Onil", "Shaq", 3.0));

        Collections.sort(people);


        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.stRing() + " earns " + person.thisPays() + " tenge");
        }
    }
}