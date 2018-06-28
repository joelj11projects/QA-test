package level_1;

public class ArrayClass {
    public static void main(String[] args) {


        int[] intArray = {2,5,53,11,32,43,12,31,56,51};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println( returnNumber(intArray[i],2,false));
        }

    }

    private static int returnNumber(int x, int y, boolean b) {
        if (x == 0) {
            System.out.println(y+" -other value is 0");
            return y;
        } else if (y == 0) {
            System.out.println(x+ "-other value is 0");
            return x;
        }

        if (b == true) {
            int z = x + y;
            return z;
        } else {
            int z = x * y;
            return z;
        }
    }





}
