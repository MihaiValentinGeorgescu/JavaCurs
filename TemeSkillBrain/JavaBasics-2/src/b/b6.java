/*
Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca
iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.
 */

package b;

import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("cat de lung sa fie sirul? ");
        int lungimeArray = scanner.nextInt();

        double[] arrayDoble = new double[lungimeArray];

        for(int i = 0; i < lungimeArray; i++){
            System.out.print("dati elementul de pe pozitia: " + i + " = ");
            arrayDoble[i]=scanner.nextDouble();
        }

        for(int i = 0; i <= 7; i++){
            if( i == 2 ){
                continue;
            }else{
                if(i == 7){
                    break;
                }else{
                    System.out.println("index invaliud " + i);
                }
            }
        }
    }
}
