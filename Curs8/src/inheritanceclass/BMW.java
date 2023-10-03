package inheritanceclass;

public class BMW extends Autovehicul{

    public void gear(){
        System.out.println("Cutia este automata. ");
    }

    public void marca(){
        System.out.println("Marca este bemve. ");
    }

    @Override
    public void accelerare() {
        System.out.println("Mi-au sarit pistoanele. ");
    }
}
