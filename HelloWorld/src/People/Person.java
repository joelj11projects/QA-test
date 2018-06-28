package People;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Person {

    String name;
    int age;
    String job;

    public Person(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
        ap.add(this);
    }

    static ArrayList<Person> ap = new ArrayList<>();

    @Override
    public String toString(){
        return "Name:" + name + "Age:" + age + "Job:" + job;
    }




public static void printList() {
    for (Person p : ap) {
        System.out.println(p);
    }


}
}
