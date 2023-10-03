package cevaProiectIDontKnow;

public class Biciclette extends Vehicle{
    public String nrViteze;
    public Biciclette(String tip, String model, double rentalRatePerDay, String nrViteze) {
        super(tip, model, rentalRatePerDay);
        this.nrViteze = nrViteze;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("nr viteze " + nrViteze);
    }

}
