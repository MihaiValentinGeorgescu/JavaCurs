public class SharedDigit {
    public static void main(String[] args) {
        int nr1 = 5;
        int nr2 = 25;

        if(Verificare(nr1,nr2)){
            System.out.println("da");
        }else{
            System.out.println("nu");
        }
    }

    public static boolean Verificare(int a, int b){
        int digitA;

        while( a != 0 ){
            digitA = a % 10;
            while( b != 0 ){
                if( digitA == b % 10){
                    return true;
                }
                b = b / 10;
            }
            a = a / 10;
        }

        return false;
    }
}
