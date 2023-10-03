import Utils.Utils;

public class LeapyearCalculator {
    public static void main( String[] args){
        System.out.print("dati un an ");
        int an = Utils.scanner().nextInt();

        if ( isLeapYear(an)){
            System.out.println("anul este leap");
        }else{
            System.out.println("anul nu este leap");
        }
    }

    public static boolean isLeapYear(int year){
        if ( year <= 1 || year > 9999 ) {
            return false;
        }else{
            if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
                return true;
            }else{
                return false;
            }
        }
    }
}
