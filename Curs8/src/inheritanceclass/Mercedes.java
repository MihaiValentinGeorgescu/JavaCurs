package inheritanceclass;

public class Mercedes extends Autovehicul{

    public void gear() {
        System.out.println("Cutia este automata. ");
    }

    public void marca() {
        System.out.println("Marca este mertan. ");
    }

    public void tipMotor(){
        System.out.println("Motor cu cuplu de betoniera. ");
    }

    @Override
    public void pornireMotor() {
        System.out.println("Motoru porneste la buton. ");
    }
}
