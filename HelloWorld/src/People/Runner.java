package People;


import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Person person1 = new Person("joel ",22," IT");

        Person person2 = new Person("markk ",30," Teacher");

        Person person3 = new Person("Bob ", 24," Cook");


        Person.printList();
        Scanner in = new Scanner(System.in);
        String Input = in.next();
        System.out.println("HERE:" + Input);
        /*System.out.println(person1.toString());

        System.out.println(person2.toString());

        System.out.println(person3.toString());*/



        //String[] arrays = {person1.toString()};
        //System.out.println(arrays);




    }





}
