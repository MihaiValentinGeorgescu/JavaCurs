import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numarul");

        int numar = scanner.nextInt();

        if( numar > 0){
            System.out.println("numarul este mai mare 0");
        }else{
            if( numar == 0){
                System.out.println("numarul este 0");
            }else{
                System.out.println("numarul este mai mic 0");
            }
        }

    }
}