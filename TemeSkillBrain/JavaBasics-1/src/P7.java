import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("dati numarul: ");
        int numar = scanner.nextInt();

        suma(numar);
        scadere(numar);
        inmultire(numar);
        impartire(numar);
        modul(numar);

    }

    public static int suma(int numar){
        int var = numar + 5;
        System.out.println("suma calculata cu 5 este: " + var);
        return var;
    }

    public static double scadere(int numar){
        double var = numar - 12.3;
        System.out.println("scaderea calculata cu -12.3: " + var);
        return var;
    }

    public static double inmultire(int numar){
        double var = numar * (-3.2);
        System.out.println("inmultirea calculata cu -3.2: " + var);
        return var;
    }

    public static int impartire(int numar){
        int var = numar % 4;
        System.out.println("impartirea calculata cu 4 este: " + var);
        return var;
    }

    public static int modul(int numar){
        int var = numar / 6;
        System.out.println("modulul calculat cu 6 este: ");
        return var;
    }
}
