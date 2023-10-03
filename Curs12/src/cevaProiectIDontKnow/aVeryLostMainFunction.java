package cevaProiectIDontKnow;

public class aVeryLostMainFunction {

    public static void main(String[] args) {
        Biciclette bicicleta = new Biciclette("bicicleta", "pegas", 15, "multe");
        Masina masina = new Masina("masina", "vw", 23, 2);
        Motorcicleta motocicleta = new Motorcicleta("motoreta", "yamaha", 12, 2);

        bicicleta.displayInfo();
        masina.displayInfo();
        motocicleta.displayInfo();

    }
}
