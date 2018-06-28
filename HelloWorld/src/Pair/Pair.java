package Pair;

public class Pair {

    public static void main(String[] args){
    division(120);



    }

    private static int division(int a){

        int i = 0;
            while (a > 1) {
                i++;


                int b = a / i;

                while (b > 1) {

                    i++;
                    b = b / i;
                    System.out.println(b);


                }


            } return a;


}}
