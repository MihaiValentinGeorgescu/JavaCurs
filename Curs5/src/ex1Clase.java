class Persoana{

    String nume;
    static int greutate = 50;

    public void prezentare(){
        System.out.println("Salut sunt " + nume + " ");
    }

    public void schimbaNume(String nume){
        this.nume = nume;
        prezentare();
    }

    public int mananca(){
        this.schimbaNume("cineva");
        return ++greutate;

    }

    public static void main(String[] args){
        Persoana personne = new Persoana();
        personne.prezentare();

        System.out.println(personne.mananca());
        System.out.println(personne.nume + " are greutatea " + Persoana.greutate );

        System.out.println("------ aialanta persoana ----------");

        Persoana persoana2 = new Persoana();

        persoana2.prezentare();
        persoana2.schimbaNume("UnBaiat");
        System.out.println(Persoana.greutate );
        Persoana.greutate = 90;


        System.out.println(persoana2.mananca());
        System.out.println(persoana2.nume + " are greutatea " + Persoana.greutate );
    }
}

