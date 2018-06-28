package level_2;

public class Blackjack {
    public static void main(String[] args) {

        play(20, 1);
    }

    private static int play(int x, int y) {
        if (x > 21 || y > 21 || x < 1 || y < 1) {
            System.out.println(0);
            return 0;
        } else {
            System.out.println(Math.max(x, y));
            return (Math.max(x, y));
        }

    }
}
