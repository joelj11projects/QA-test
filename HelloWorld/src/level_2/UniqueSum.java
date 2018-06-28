package level_2;

public class UniqueSum {
    public static void main(String[] args){

        unique(1,3,2);
    }

    private static int unique(int x, int y, int z){
        if (y == z && z == x){
            System.out.println(0);
            return 0;
        } else if (x == z) {
            System.out.println(y);
            return y;
        } else if (y == z) {
            System.out.println(x);
            return x;
        } else if (x == y) {
            System.out.println(z);
            return z;
        } else {
            System.out.println(x+y+z);
            return x+y+z;
        }


    }

}
