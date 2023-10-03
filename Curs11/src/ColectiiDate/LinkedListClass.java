package ColectiiDate;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {
        LinkedListClass obiect = new LinkedListClass();
        obiect.adaugareInLista("ana");
        obiect.adaugareInLista("are");
        obiect.adaugareInLista("mere");

        System.out.println(obiect.lista);

        System.out.println("----------------for each-----------");
        obiect.iterareinLista_ForEach();
        System.out.println("----------------iterator-----------");
        obiect.iterareinLista_Iterator();
        System.out.println("----------------for simplu-----------");
        obiect.iterareinLista_ForSimplu();

        System.out.println("----------------adaugare valaore-----------");

        obiect.adaugarePePozitie(1, "n-are");
        obiect.iterareinLista_ForEach();

        System.out.println("----------------apelare functie cu pozitie si valaore-----------");
        obiect.functieAfisareElementSiPozitie();

        System.out.println("----------------apelare functie cu remove-----------");
        obiect.functieRemove(3);
        obiect.iterareinLista_ForEach();



    }

    LinkedList<String> lista;

    public LinkedListClass(){
        lista = new LinkedList<>();
    }

    public LinkedList<String> adaugareInLista(String obiect){
        lista.add(obiect);
        return lista;
    }

    public void iterareinLista_ForSimplu(){
        for( int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    public void iterareinLista_ForEach(){
        for( String element : lista ){
            System.out.println(element);
        }
    }

    public void iterareinLista_Iterator(){
        Iterator iterator = lista.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public LinkedList<String> adaugarePePozitie(int pozitie, String valoare){
        lista.set(pozitie,valoare);
        return lista;
    }

    public void functieAfisareElementSiPozitie(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(" Elementul de pe pozitia " + i + " are ca valoare " + lista.get(i));
        }
    }

    public void functieRemove(int pozitie){
        //lista.remove(pozitie);
        lista.removeAll(lista);
    }




}
