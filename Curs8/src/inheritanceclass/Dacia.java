package inheritanceclass;

public class Dacia extends Autovehicul{

    public void gear() {
        System.out.println("Cutia este automata. ");
    }

    public void marca() {
        System.out.println("Marca este dacie. ");
    }

    public void tractiune() {
        System.out.println("Are tractiune fata. ");
    }

    @Override
    public void franare() {
        System.out.println("Nu mai trage nimic. ");
    }
}
