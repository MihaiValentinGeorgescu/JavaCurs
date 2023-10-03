/*
Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
 */

package b;
import java.util.ArrayList;
import java.util.List;

public class b8 {
    public static void main(String[] args) {
        int[] sir = {};

        if (sir.length == 0) {
            System.out.println("sirul-ul este gol.");
        } else {
            System.out.println("sirul-ul nu este gol.");
        }

        List<Integer> lista = new ArrayList<>();

        if(lista.isEmpty()){
            System.out.println("lista este goala");
        }else{
            System.out.println("lista este plina");
        }
    }
}
