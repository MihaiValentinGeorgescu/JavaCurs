import Utils.Utils;

public class ex2PrimeNumberWaaaaayComplicated {
    public static void main(String[] args) {
        System.out.print("Tastati valoarea n= ");
        int n = Utils.scanner().nextInt();

        for (int i = 1; i <= n; i++){
            if( estePrim(i) ){
                System.out.println("numarul " + i + " este prim");
            }else{
                System.out.println("numarul " + i + " nu este prim");
            }
        }
    }

    public static boolean estePrim(int numar){

        if ( numar < 2 ){
            return false;
        }
        if ( numar == 2 ){
            return true;
        }
        if ( numar % 2 == 0 ){
            return false;
        }


        for (int i = 2 ; i < numar; i++){
            if ( numar % i == 0 ){
                return false;
            }
        }

        return true;
    }
}