/*
Definiti o metoda care ia un array de numere (intregi sau cu virgula)
si sa-l ordoneze crescator sau descrescator.
 */

package b;

public class b9 {
    public static void main(String[] args) {
        int[] array = {4, 5, 3, 1, 2};

        int[] sirSortat = new int[array.length];

        for( int i = 0; i < array.length; i++){
            sirSortat[i] = array[i];
        }

        for(int i =0; i < sirSortat.length-1; i++){
            for(int j=0; j < sirSortat.length - i -1; j++){
                if(sirSortat[j] > sirSortat[j+1]){
                    int aux = sirSortat[j];
                    sirSortat[j] = sirSortat[j+1];
                    sirSortat[j+1] = aux;
                }
            }
        }

        System.out.println("sirul sortat este urmatorul:");

        for(int i = 0; i <= sirSortat.length-1; i++){
            System.out.print(sirSortat[i] + " ");
        }
    }
}
