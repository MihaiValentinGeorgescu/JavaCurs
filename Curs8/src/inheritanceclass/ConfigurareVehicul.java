package inheritanceclass;

public class ConfigurareVehicul {

    public static void main(String[] args) {

        BMW bemveu = new BMW();
        Mercedes mertan = new Mercedes();
        Dacia dacie = new Dacia();

        bemveu.accelerare();
        bemveu.franare();
        bemveu.marca();

        mertan.pornireMotor();
        mertan.tipMotor();
        mertan.oprireMotor();

        dacie.pornireMotor();
        dacie.gear();
        dacie.tractiune();

    }
}
