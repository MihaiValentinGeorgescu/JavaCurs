package ColectiiDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArrayListExercises2 {

    public static void main(String[] args) {

        ArrayListExercises2 obj1 = new ArrayListExercises2();
        obj1.listaCulori("rosu");
        obj1.listaCulori("verde");
        obj1.listaCulori("alb");
        obj1.listaCulori("albastru");
        obj1.listaCulori("negru");
        obj1.listaCulori("yelow");

        obj1.iterateThroughList();


        System.out.println(obj1.culori);
        System.out.println(Arrays.asList(obj1.culori));

//        System.out.println(obj1.iterateThroughList2());
        obj1.iterateList();
        obj1.iterateThroughList2();

        obj1.updatePositionByINdex(3, "ceva");
        obj1.iterateThroughList2();

        System.out.println(obj1.updatePositionByINdex(obj1.culori.size()/2, "maro"));

        obj1.randomVal();

        if(obj1.searchForSth("ceva")){
            System.out.println("da");
        }else{
            System.out.println("nu");
        }

        if(obj1.searchForSth2("ceva")){
            System.out.println("da");
        }else{
            System.out.println("nu");
        }

    }
    ArrayList<String> culori;

    public ArrayListExercises2(){
        culori = new ArrayList<>();
    }

    public ArrayList<String> listaCulori(String culoare){
        culori.add(culoare);
        return culori;
    }

    public void iterateThroughList(){

        for(String color: culori){
            System.out.println(color);
        }

    }

    public void iterateThroughList2(){

        for(int i = 0; i < culori.size(); i++){
            System.out.println(culori.get(i));
        }
    }

    public void iterateList(){
        Iterator<String> iterator = culori.iterator();
        while(iterator.hasNext()){
            System.out.println("iterare cu iterator " + iterator.next());
        }
    }

    public ArrayList<String> updatePositionByINdex(int index, String value){
        culori.set(index, value);
        addNewValue(index, value);
        return culori;
    }

    public void addNewValue(int index, String value){
        culori.add(index+1, value);
    }

    public void randomVal(){
        Random random = new Random();

        System.out.println(culori.get(random.nextInt(culori.size())));
    }

    public void removeElement(int index){
        culori.remove(index);
    }

    public boolean searchForSth(String value){

        for(String element : culori){
            if (element == value){
                return true;
            }
        }

        return false;
    }

    public boolean searchForSth2(String value){

        for(int i = 0; i <= culori.size()-1; i++){
            if ( culori.get(i).contains(value)){
                return true;
            }
        }

        return false;
    }
}
