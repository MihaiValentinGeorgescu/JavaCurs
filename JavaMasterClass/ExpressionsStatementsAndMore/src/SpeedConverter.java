import Utils.Utils;

public class SpeedConverter {
    public static void main(String[] args){
        System.out.print("cat de rapid merge mazsina in kilometersi ");
        int viteza = Utils.scanner().nextInt();
        System.out.println("vieza transformata este de " + toMilesPerHour(viteza) + " mile pe ora");
        printConversion(viteza, toMilesPerHour(viteza));
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if ( kilometersPerHour < 0 ){
            return -1;
        }else{
            long milesMorales = Math.round(kilometersPerHour / 1.60934) ;
            return milesMorales;
        }
    }

    public static void printConversion(long valFinala, long valInitiala){
        System.out.println(valInitiala + " km/h " + " = " + valFinala + " mi/h");
    }
}
