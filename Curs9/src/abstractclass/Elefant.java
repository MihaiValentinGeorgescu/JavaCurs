package abstractclass;

public class Elefant implements Comportament{


    @Override
    public void bea() {
        System.out.println("Elefantu bea. ");
    }

    @Override
    public void suprasvietuieste() {
        System.out.println("elefantu supravietuieste. ");
    }

    @Override
    public String esteVanat(String tipAnimalVinat) {
        System.out.println("elefantu ce vaneaza? ");
        return "elefantu este vanat de braconieri" + tipAnimalVinat;
    }
}
