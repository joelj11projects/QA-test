package ShapesMain;

import com.sun.org.apache.regexp.internal.RE;
import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapesMain {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double num = Double.parseDouble(input);


        Square sq = new Square(num);
        Rectangle re = new Rectangle(10.0,11.0);
        Circle ci = new Circle(5.5);


        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(sq);
        shapes.add(re);
        shapes.add(ci);
        System.out.println(sq.area);
        System.out.println(re.area);
        System.out.println(ci.area);

        for(Shape s : shapes){

            if (s instanceof Rectangle){
                Rectangle r = (Rectangle)s;
                System.out.println(r);
            }
            System.out.println(s);
        }
    }
}
