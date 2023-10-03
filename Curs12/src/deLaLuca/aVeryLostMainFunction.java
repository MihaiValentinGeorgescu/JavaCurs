package deLaLuca;
public class aVeryLostMainFunction {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.3, 4.1);
        Circle circle = new Circle(5.5);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Area of rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle is: " + rectangle.getPerimeter());
        System.out.println();
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Perimeter of circle is: " + circle.getPerimeter());
        System.out.println();
        System.out.println("Area of triangle is: " + triangle.getArea());
        System.out.println("Perimeter of triangle is: " + triangle.getPerimeter());

        // se poate folosi printf pentru a afisa intr-un mod frumos rezultatul double cu 2 zecimale
    }
}