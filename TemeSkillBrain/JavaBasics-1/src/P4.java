import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("dati o propozitie: ");

        String propozitie = scanner.nextLine();

        System.out.println("propozitia citita mai sus este: " + propozitie);
        scanner.close();
    }
}
