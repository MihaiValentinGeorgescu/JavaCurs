import Utils.Utils;

public class NumberOfDaysInMonth {
    public static void main(String[] args){
        System.out.print("dati un an ");
        int an = Utils.scanner().nextInt();
        System.out.print("dati o luna ");
        int luna = Utils.scanner().nextInt();

        System.out.println(getDaysInMonth(luna, an));
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

    public static int getDaysInMonth(int month, int year){
        if( (month < 1 || month > 120) || ( year < 1 || year > 9999 )){
            return -1;
        }

        boolean isleap = isLeapYear(year);

        int days;

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                if (isleap)
                    days = days + 1;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = -1;
                break;
        }

        return days;

    }
}
