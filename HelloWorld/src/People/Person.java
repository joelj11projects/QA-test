package People;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Person {

    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
        ap.add(this);
    }

    static ArrayList<Person> ap = new ArrayList<>();

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Job: " + job;
    }


    public static void printList() {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter name here: ");
            String Input = in.next();
            for (Person a : ap) {
            if (Input.equals(a.name)) {
                System.out.println(a);

            }

        }
    }
}
