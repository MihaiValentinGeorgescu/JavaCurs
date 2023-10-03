/*
Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for,
si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
 */

package b;
import java.util.Scanner;
public class b5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("cat de lung sa fie sirul? ");
        int lungimeArray = scanner.nextInt();

        double[] arrayDoble = new double[lungimeArray];

        for(int i = 0; i < lungimeArray; i++){
            System.out.print("dati elementul de pe pozitia: " + i + " = ");
            arrayDoble[i]=scanner.nextDouble();
        }

        for(int i = 0; i < lungimeArray; i++){
            if( arrayDoble[i] == 4.5 ){
                System.out.println("numarul de pe poz " + i + " este egal cu 4.5");
            }else{
                if( arrayDoble[i] > 5){
                    System.out.println("numarul de pe poz " + i + " este mai mare dec at 5");
                }
            }
        }
    }
}
