import Utils.Utils;
public class AreaCalculator {
    public static void main(String[] args){
        System.out.println("dati raza ");
        double raza = Utils.scanner().nextDouble();

        System.out.println("dati latura mica ");
        double laturaMica = Utils.scanner().nextDouble();

        System.out.println("dati latura mare ");
        double laturaMare = Utils.scanner().nextDouble();

        System.out.println(area(raza));
        System.out.println(area(laturaMica, laturaMare));


    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        } else {
            double area = Math.PI * radius * radius;
            return area;
        }
    }

    public static double area(double smalBase, double biggerBase) {

        if (smalBase < 0 || biggerBase < 0) {
            return -1.0;
        } else {
            double area = smalBase * biggerBase;
            return area;
        }
    }
}
