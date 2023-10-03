package interfaces;

public class AntrenorHandball implements Antrenor{

    public void sport(String tipSport){
        System.out.println("Acesta este un antrenor de: " + tipSport);
    }

    public void nrEchipe(int numar){
        System.out.println("Antrenorul trebuie sa antreneze " + numar + " echipe");
    }

    @Override
    public void tipa() {
        System.out.println("Antrenorul tipa");
    }

    @Override
    public void suteaza() {
        System.out.println("Antrenorul suteaza");
    }

    @Override
    public void alearga() {
        System.out.println("Antrenorul alearga");
    }

    @Override
    public void antreneaza() {
        System.out.println("Antrenorul antreneaza echipe");
    }
}
