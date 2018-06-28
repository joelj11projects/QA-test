package level_1;

public class HelloWorld {

    public static void main(String[] args){
        String a = "Hello ";
        System.out.println(a);
        helloWorld("Helloooo");

        System.out.println(welcomePrint());

        returnNumber(0,6, true);

        repeatNumber();

    }

    private static void helloWorld (String hw){

        System.out.println(hw);
    }

    private static String welcomePrint(){

        return "Hello World!";
    }


    private static int returnNumber(int x, int y, boolean b){

//        if (x == 0) {
//            System.out.println(y+" -other value is 0");
//            return y;
//        } else if (y == 0) {
//            System.out.println(x+ "-other value is 0");
//            return x;
//        }

        if (b == true) {
            int z = x + y;
            //System.out.println(z);
            return z;
        } else {
            int z = x * y;
            //System.out.println(z);
            return z;
        }


    }

    private static void repeatNumber() {
        for (int i = 0; i < 10; i++){
            System.out.println(returnNumber(i, 5, false));
        }
    }






}
