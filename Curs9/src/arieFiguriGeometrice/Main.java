package arieFiguriGeometrice;

public class Main {
    public static void main(String[] args) {
        Cerc cerc = new Cerc();
        Patrat patrat = new Patrat();

        System.out.println("Aria cercului este: " + cerc.calculeazaArie(3));
        System.out.println("Aria patratului este: " + patrat.calculeazaArie(4));
    }
}
