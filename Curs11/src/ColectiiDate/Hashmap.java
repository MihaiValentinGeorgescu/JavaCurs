package ColectiiDate;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {
        Hashmap listaHashMap = new Hashmap();
        listaHashMap.adaugareInMap(1, "ana");
        listaHashMap.adaugareInMap(2, "are");
        listaHashMap.adaugareInMap(3, "mere");

        System.out.println(listaHashMap.hashMap);
        listaHashMap.AboutMap();



    }
    Map<Integer , String> hashMap;

    public Hashmap(){
        hashMap = new HashMap<>();
    }

    public Map<Integer , String> adaugareInMap(int cheie, String valoare){
        hashMap.put(cheie, valoare);
        return hashMap;
    }

    public void AboutMap(){
        System.out.println(hashMap.keySet() + " -- " + hashMap.values());
        System.out.println(hashMap.get(2));
    }


}
