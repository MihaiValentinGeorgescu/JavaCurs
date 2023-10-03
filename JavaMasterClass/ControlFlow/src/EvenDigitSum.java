import Utils.Utils;

public class EvenDigitSum {

    public static void main(String[] args){
        System.out.print("dati nr ");
        int numar = Utils.scanner().nextInt();

        System.out.println(getEvenDigitSum(numar));

    }

    public static int getEvenDigitSum(int nr){

        int suma = 0;

        while( nr != 0 ){
            if( (nr % 10)%2 ==0){
                suma = suma + nr % 10;
            }
            nr = nr / 10;
        }

        return suma;
    }
}
