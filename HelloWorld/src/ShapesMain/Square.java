package ShapesMain;

public class Square extends Rectangle implements Perimeter{
    double sideLength;

    public Square(double sideLength){
        super(sideLength,sideLength);
        this.sideLength = sideLength;
        area = calcArea();

    }

    @Override
    public double calcArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter(){
        return 4 * sideLength;
    }
}
