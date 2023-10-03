/*
Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3,
respectiv 5 elemente. Initializati array-ul. Afisati primele si ultimele elemente
din fiecare dimensiune pe ecran.
 */

package b;

public class b3 {
    public static void main(String[] args) {
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6, 7, 8},
        };

        int numRanduri = twoDArray.length;

        for (int i = 0 ; i <= numRanduri -1; i++){
            int numColoane = twoDArray[i].length;
            for (int j = 0; j <= numColoane-1; j++){
                if (( i == 0 && j == 0) || (i == numRanduri-1 && j == numColoane-1) || (i == 0 && j == numColoane-1) || (i == numRanduri-1 && j == 0)){
                    System.out.println(twoDArray[i][j]);
                }
            }
        }
    }
}
