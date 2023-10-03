package inheritanceExample;

public class aVeryLostMainFunction {

    public static void main(String[] args) {
        Pisica pisica = new Pisica();
        Animal pisica2 = new Pisica();
        //Caine caine = (Caine) new Pisica();

        pisica.zgarie();
        pisica2.zgarie();
        pisica2.zgarieAsAnimal();

        //((AlteActiuni)pisica2).zgarie();


    }
}
