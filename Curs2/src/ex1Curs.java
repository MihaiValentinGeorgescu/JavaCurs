import java.util.Scanner;

public class ex1Curs {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tastati valoarea: ");
        double var = scanner.nextDouble();

        double valoareConvertita = converter( var );

        System.out.println(valoareConvertita);
    }

    public static double converter(double x){

        return ((x-32)*5)/9;
    }
}
