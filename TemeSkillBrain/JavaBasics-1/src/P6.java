import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        variabile();
    }

    public static void variabile(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("dati primul nr: ");
        int numar1 = scanner.nextInt();

        System.out.print("dati al doilea nr: ");
        int numar2 = scanner.nextInt();

        System.out.println("primul numar este: " + numar1);
        System.out.println("al doilea nr este: " + numar2);

        scanner.close();

    }

}
