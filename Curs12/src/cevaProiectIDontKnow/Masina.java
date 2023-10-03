package cevaProiectIDontKnow;

public class Masina extends Vehicle{

    public int nrLocuri;
    public int rent;
    public Masina(String make, String model, double rentalRatePerDay, int nrLocuri) {
        super(make, model, rentalRatePerDay);
        this.nrLocuri = nrLocuri;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("nr locuri " + nrLocuri);
    }
}
