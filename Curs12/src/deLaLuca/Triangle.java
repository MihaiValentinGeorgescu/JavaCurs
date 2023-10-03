package deLaLuca;

public class Triangle implements IShape{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // presupunem ca cele 3 lungimi de laturi permit constructia unui triunghi
    //ca sa putem sa-i calculam aria si perimetrul
    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        double a = p - side1;
        double b = p - side2;
        double c = p - side3;
        return Math.sqrt(p * a * b * c);
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
