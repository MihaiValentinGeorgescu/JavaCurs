/*
Definiti un array de char-uri. Iterati array-ul folosind structura for,
si afisati pe ecran cate al doilea caracter din sir.
 */

package b;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("cat de lung sa fie sirul de caractere? ");
        int lungimeArray = scanner.nextInt();

        char[] arrayChar = new char[lungimeArray];

        for ( int i = 0; i <= lungimeArray-1 ; i++){
            System.out.print("dati valoarea caracterului de pe pozitia: " + i + " = ");
            arrayChar[i] = scanner.next().charAt(0);

        }

        for (int i = 0; i <= 1 ; i++) {
            System.out.print(arrayChar[i] + " ");
        }


    }
}
