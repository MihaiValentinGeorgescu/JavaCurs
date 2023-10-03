package cevaProiectIDontKnow;

public class Motorcicleta extends Vehicle{
    public int nrPistoane;


    public Motorcicleta(String tip, String model, double rentalRatePerDay, int nrPistoane) {
        super(tip, model, rentalRatePerDay);
        this.nrPistoane = nrPistoane;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("nr pistoane = " + nrPistoane);
    }
}
