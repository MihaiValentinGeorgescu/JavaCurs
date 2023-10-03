import Utils.Utils;

public class EqualSumChecker {
    public static void main(String[] args){
        System.out.print("dati primu nr ");
        int nr1 = Utils.scanner().nextInt();

        System.out.print("dati al doilea nr ");
        int nr2 = Utils.scanner().nextInt();

        System.out.print("dati al 3 lea nr ");
        int nr3 = Utils.scanner().nextInt();

        if ( hasEqualSum(nr1, nr2, nr3)){
            System.out.println("e bn");
        }else{
            System.out.println("nu e bn");
        }
    }

    public static boolean hasEqualSum(int param1, int param2, int param3 ){
        if ( param1 + param2 == param3 ){
            return true;
        }else{
            return false;
        }
    }
}
