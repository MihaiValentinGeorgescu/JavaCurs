import Utils.Utils;

public class NumberPalindrome {
    public static void main(String[] args){
        System.out.print("dati un nr " );
        int numar = Utils.scanner().nextInt();

        if( isPalindrome(numar) ){
            System.out.println("numarul este palindrom");
        }else{
            System.out.println("numarul nu este palindrom");
        }

    }

    public static boolean isPalindrome(int number){
        int copyOfNumber = number;
        int numberReversed = 0;
        do{
            numberReversed = numberReversed * 10 + copyOfNumber%10;
            copyOfNumber = copyOfNumber /10;
        }while(copyOfNumber != 0);

        if ( number == numberReversed ){
            return true;
        }else{
            return false;
        }
    }
}
