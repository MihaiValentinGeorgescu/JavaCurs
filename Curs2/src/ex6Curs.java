import Utils.Utils;

public class ex6Curs {
    public static void main(String[] args){

        System.out.println("Tastati primul string");
        String sir1 = Utils.scanner().nextLine();
        System.out.println("Tastati al doilea string string");
        String sir2 = Utils.scanner().nextLine();

        if ( sir1.equals(sir2)){
            System.out.println("stringurile sunt egale");
        }else{
            System.out.println("stringurile nu sunt egale");
        }
    }
}