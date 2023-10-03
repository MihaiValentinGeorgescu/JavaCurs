package cevaProiectIDontKnow;

public class Vehicle {
    public String tip;
    public String model;
    public double chirie;

    public Vehicle(String tip, String model, double rentalRatePerDay) {
        this.tip = tip;
        this.model = model;
        this.chirie = rentalRatePerDay;
    }

    public void displayInfo(){
        System.out.println("Tip vehicul " + tip);
        System.out.println("Model " + model);
        System.out.println("Chirie " + chirie);
    }


}
