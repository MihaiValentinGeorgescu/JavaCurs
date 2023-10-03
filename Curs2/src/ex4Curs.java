import Utils.Utils;

public class ex4Curs {
    public static void main(String[] args) {

        System.out.println("tastati prima valoare a= ");
        int a = Utils.scanner().nextInt();

        System.out.println("tastati prima valoare b= ");
        int b = Utils.scanner().nextInt();

        if ( a % 2 == 0 ){
            System.out.println("Valoarea a = " + a + " este para");
        }else{
            System.out.println("Valoarea a = " + a + " este impara");
        }

        if ( b % 2 == 0 ){
            System.out.println("Valoarea b = " + b + " este para");
        }else{
            System.out.println("Valoarea b = " + b + " este impara");
        }
    }
}
