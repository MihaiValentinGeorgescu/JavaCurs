package ColectiiDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
write a java program to create an array list, add
some colors(strings) and print out the collection
 */

public class ArrayListExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dati culoarea: ");
        String culoare = scanner.nextLine();

        ArrayList<String> sir = new ArrayList<>();
        sir = CreateArrayListCulori();

        AdaugareCuloriDeLaTastatura(sir, culoare);
        System.out.println(sir);
        System.out.println(sir.toString());
        System.out.println(Arrays.asList(sir));
    }

    public static ArrayList<String> CreateArrayListCulori(){
        ArrayList<String> lista = new ArrayList<>();

        lista.add("alb");
        lista.add("negru");
        lista.add("albastru");

        return lista;
    }

    public static ArrayList<String> AdaugareCuloriDeLaTastatura(ArrayList lista , String culoare){
        lista.add(culoare);
        return lista;
    }
}
