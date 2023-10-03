import Utils.Utils;

public class PlayingCat {
    public static void main(String[] args){
        System.out.print("dati temperatura = ");
        int minute = Utils.scanner().nextInt();

        if(isPlaying(true, minute)){
            System.out.println("se joaca");
        }else{
            System.out.println("nuse joaca");
        }
    }

    public static boolean isPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature <= 45 && temperature >= 25) {
                return true;
            } else {
                return false;
            }
        }else{
            if (temperature <= 35 && temperature >= 25) {
                return true;
            } else {
                return false;
            }
        }
    }
}
