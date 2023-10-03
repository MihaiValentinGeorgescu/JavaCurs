package abstractclass;

public class Tigru extends Animal{

    @Override
    public void Doarme() {
        //super.Doarme();
        System.out.println("tigru doarme 24 ore. ");
    }

    @Override
    public void mananca() {
        System.out.println("tigru mananca zebre. ");
    }

    @Override
    public void scoateSunet(String sunet) {
        System.out.println("tigru face " + sunet);
    }

    @Override
    public String vaneaza() {
        super.Doarme();
        return "tigru vaneaza de la mega image. ";
    }
}
