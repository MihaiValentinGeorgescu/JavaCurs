import Utils.Utils;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args){
        System.out.print("dati nr de minute = ");
        long minute = Utils.scanner().nextLong();

        printYearsAndDays(minute);
    }

    public static void printYearsAndDays(long minutes){
        if ( minutes == 0){
            System.out.println("invalid value");
        }else{
            long days = minutes / (24 * 60);
            long years = days / 365 ;
            System.out.println(minutes + " min " + " = " + years + " y " + " = " + days + " d ");
        }
    }
}
