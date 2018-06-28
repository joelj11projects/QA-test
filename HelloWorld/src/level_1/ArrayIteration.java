package level_1;

import java.util.Random;

public class ArrayIteration {
    public static void main(String[] args){

        iteration1();
        iteration2();
    }

    private static void iteration1(){
        int[] myArray = {2,4,11,54,23,32,12,14,34,44};

        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
    }



    private static void iteration2() {
        int[] finalArray = new int[10];
        Random randomNumberGenerator = new Random();
        System.out.println("Multiply by 10");
        for (int i = 0; i < finalArray.length; i++){
            finalArray[i] = randomNumberGenerator.nextInt(100);
        }

        for (int i = 0; i < finalArray.length; i++){
            finalArray[i] = finalArray[i] +1;
            System.out.println(finalArray[i]);}
    }

}
