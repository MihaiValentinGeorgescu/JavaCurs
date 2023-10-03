package arieFiguriGeometrice;

public class Cerc implements ariaGeometrica{

    @Override
    public double calculeazaArie(double latura) {
        return Math.PI*latura*latura;
    }

    public void adunareCifre(){
        System.out.println("imi aduna cifre din Cerc :P ");
    }
}
