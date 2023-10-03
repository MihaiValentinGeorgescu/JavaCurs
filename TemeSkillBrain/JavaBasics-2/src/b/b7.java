/*
Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
 */

package b;

public class b7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        System.out.println("suma elementelor din sir este: " + sum);
    }
}

