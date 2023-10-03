import Utils.Utils;

public class ex2PrintPrimeNumber {
    public static void main(String[] args) {
        System.out.print("Tastati valoarea n= ");
        int n = Utils.scanner().nextInt();
        int contor=0;

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if( i % j == 0){
                    ++contor;
                }
            }

            if(contor == 2){
                System.out.println("numarul " + i + " este prim");
            }
            contor = 0;
        }
    }
}