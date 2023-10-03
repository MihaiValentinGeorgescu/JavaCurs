
class Masina{

    public static void main(String[] args){
        Masina masina1 = new Masina("bmw", "seria 8", 2021);
        System.out.println(masina1.accelerare);
        masina1.Accelerare();
        masina1.Accelerare();
        masina1.Accelerare();
        masina1.Accelerare();
        masina1.Franare();
        masina1.Franare();
        masina1.Franare();
        masina1.Franare();
        masina1.Franare();
        masina1.MersCuSpatele();
        masina1.MersCuSpatele();

    }

    String marca;
    String model;
    String culoare;
    int an;

    int accelerare = 0;
    public Masina(String marca, String model, String culoare, int an){
        this.culoare = culoare;
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    public Masina(String model, String marca, int an){
        this.culoare = "white";
        this.marca = marca;
        this.model = model;
    }
    public void Accelerare(){
        accelerare = accelerare + 20;
        System.out.println("Masina Accelereaza cu viteza " + accelerare + " km/h " + " viteza cuyrenta " + SchimbaViteza(accelerare));
    }

    public void Franare(){

        if ( accelerare > 0 ) {
            accelerare = accelerare - 20;
            System.out.println("Masina franeaza si are viteza actuala dupa franare de " + accelerare);
        }else{
            System.out.println("Masina e oprita");
        }
    }

    public String SchimbaViteza(int accelerare){
        System.out.println("Schimb viteza");

        switch(accelerare){
            case 10:
                return "1st gear";
            case 20: case 30: case 40:
                return "2dt gear";
            case 50:
                return "3rd gear";
            case 60: case 70: case 80:
                return "4th gear";
            default:
                return "racheta";
        }
    }

    public void MersCuSpatele(){

        if ( SchimbaViteza(this.accelerare).equalsIgnoreCase("racheta")){
            accelerare -= 10;
            System.out.println(" merg cu spatele cu atata la ora " + accelerare);
        }else{
            System.out.println("nu merge");
        }
    }
}


/*
 - parametrii
marca
model
culoare
an

 - metode
 accelerare
 franare
 schimba viteza
 mers in mansalier
*/