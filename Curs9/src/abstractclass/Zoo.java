package abstractclass;

public class Zoo {
    public static void main(String[] args) {

        Tigru tigru = new Tigru();

        System.out.println("obiectul tigru");
        tigru.mananca();
        tigru.Doarme();
        tigru.scoateSunet("muu");

        System.out.println(tigru.vaneaza());

        tigru.Doarme();
        System.out.println("------------------");
        System.out.println("obiectul pisica");
        Animal pisica = new Tigru();
        pisica.Doarme();
        System.out.println("------------------");

        System.out.println("obiectul caine");
        Animal caine = (Animal) new Tigru();
        caine.scoateSunet("muu");
        System.out.println("------------------");

        System.out.println("obiectul elefant");
        Elefant elefant = new Elefant();
        System.out.println(elefant.esteVanat("braconieri"));
        elefant.bea();
        elefant.suprasvietuieste();



    }
}
