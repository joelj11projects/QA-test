
package Pair;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AnotherPair {
    public static void main(String[] args) {
        //new method
        AnotherPair y = new AnotherPair();
        y.arrayNew();

    }


    public void arrayNew() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input Doggo Position Number: ");

        int input = in.nextInt();
        int[] array = IntStream.range(1, 100 + 1).toArray();
        for (int x : array) {
            if (x == input) {
            continue;
            }

       // System.out.println("\n");

        array[x-1] = x + 1;
        System.out.println(x); }
        }
    }


