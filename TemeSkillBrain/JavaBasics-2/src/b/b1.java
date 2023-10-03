/*
Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
Daca numarul introdus de la tastatura este mai mic decat numarul random generat, afisati mesajul
“Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random generat
in textul afisat).
 */

package b;
import java.util.Random;
import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Random random = new Random();
        int nrRandom = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        System.out.print("dati nr pe care dorim sa il comparam: ");
        int numer = scanner.nextInt();

        if( numer == nrRandom ){
            System.out.println("ai ghicit numarul");
        }else{
            System.out.println("nu ai ghicit numarul");
        }


    }
}
