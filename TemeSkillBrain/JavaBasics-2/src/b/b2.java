/*
Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile.
Folosind structura switch, daca s-a introdus un caracter anume, realizati
operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
-‘a’: adaugare
-‘s’: scadere
-‘i’: inmultire
-‘p’: impartire
-‘m’: modul
Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
 */


package b;
import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("dati primul nr: ");
        float nr1 = scanner.nextFloat();

        System.out.print("dati al doilea nr: ");
        float nr2 = scanner.nextFloat();

        System.out.print("dati litera de la numele operatiei: -‘a’: adaugare\n" +
                "-‘s’: scadere\n" +
                "-‘i’: inmultire\n" +
                "-‘p’: impartire\n" +
                "-‘m’: modul\n" +
                "aici scrieti valoarea:...");

        char litera = scanner.next().charAt(0);
        scanner.close();

        float rezultat = functieCuSwitch(nr1, nr2, litera);

        afisareMesaj(litera);
        System.out.println(rezultat);

    }

    public static float functieCuSwitch(float a, float b, char operatie){

        float varStocareOperatie = 0;

        switch (operatie){
            case 'a':
                varStocareOperatie = a + b;
                break;

            case 's':
                varStocareOperatie = a - b;
                break;

            case 'i':
                varStocareOperatie = a * b;
                break;

            case 'p':
                varStocareOperatie = a % b;
                break;

            case 'm':
                varStocareOperatie = a / b;
                break;

            default:
                System.out.println("invalid input");
                break;
        }

        return varStocareOperatie;
    }

    public static void afisareMesaj(char litera){

        switch (litera){
            case 'a':
                System.out.print("adunarea dintre a si b este: ");
                break;

            case 's':
                System.out.print("scaderea dintre a si b este: ");
                break;

            case 'i':
                System.out.print("inmultirea dintre a si b este: ");
                break;

            case 'p':
                System.out.print("restul impartirii dintre a si b este: ");
                break;

            case 'm':
                System.out.print("modulul dintre a si b este: ");
                break;

            default:
                System.out.println("invalid input");
                break;
        }
    }
}
