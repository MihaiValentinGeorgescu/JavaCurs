import Utils.Utils;

public class DecimalComparator {
    public static void main(String[] args){
        System.out.print("dati primu nr ");
        double nr1 = Utils.scanner().nextDouble();

        System.out.print("dati al doilea nr ");
        double nr2 = Utils.scanner().nextDouble();

        if ( areEqualByThreeDecimalPlaces(nr1, nr2)){
            System.out.println("e bn");
        }else{
            System.out.println("Nu e bn");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double nr1, double nr2){
        nr1 = nr1 * 1000;
        nr2 = nr2 * 1000;

        int nr1Int = (int) nr1;
        int nr2Int = (int) nr2;

        if ( nr1Int == nr2Int ){
            return true;
        }else{
            return false;
        }
    }
}
