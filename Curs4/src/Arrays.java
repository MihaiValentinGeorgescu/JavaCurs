
import Utils.Utils;
public class Arrays {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        System.out.println("variabila de tip int este convertita in String 123456" + arrays.conversie(Utils.scanner().nextInt()));
    }
    //Transform an int in String
    public String conversie(int test) {
        return String.valueOf(test);
    }
}