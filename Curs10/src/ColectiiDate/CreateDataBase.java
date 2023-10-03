package ColectiiDate;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CreateDataBase {
    public static void main(String[] args) {
        String propozitie = "ceva bun";
        String[] sir = propozitie.split(" ");

        System.out.println(sir[1]);

        ArrayList<String> obj1 = new ArrayList<>();

        for (String element : sir ) {
            obj1.add(element);
        }

        System.out.println(obj1.toString());
        System.out.println(Arrays.asList(obj1));
        System.out.println(obj1.get(0));

        obj1.add(" si");
        obj1.add(" mai bun");

        System.out.println(Arrays.asList(obj1));
        System.out.println(obj1);

        obj1.set(3, " nu mai vinde nimic "); //inlocuieste pe poz aia cu asta
        System.out.println(obj1);

        List<String> obj2 = new ArrayList<>();
        obj2.add("cuvint");

        System.out.println("------------------------metoda obj2-----------------------");
        System.out.println(obj2);

        obj2.add(new String("probabil suprascris()nu este suprascris este adaugat in plus:P"));
        System.out.println(obj2);

        for( String element : obj2 ){
            System.out.println("elementele acestui obiect (obj2) sunt: " + element);
        }

        System.out.println("------------------------metoda obj2 dar cu stream-----------------------");
        obj2.stream().forEach(System.out::println);

        //obj2.stream().findFirst().equals("cuvint");

        System.out.println(obj2.stream().findFirst().get());

        //boolean valoare = obj2.stream().filter(v -> v.contains("nu")).collect(Collectors.toList());
        System.out.println("------------------------test chestie-----------------------");
        System.out.println(obj2.stream().filter(v -> v.contains("nu")).collect(Collectors.toList()));
    }

}
