public class CMMDC {
    public static void main(String[] args) {
        int nr1 = 30;
        int nr2 = 20;

        if( CMMDC(nr1,nr2) != 1 ){
            System.out.println(CMMDC(nr1,nr2));
        }else{
            System.out.println("nu");
        }
    }

    public static int CMMDC(int a, int b){
        int i;
        if( a < b ){
            i = a;
        }else{
            i = b;
        }

        for(int j = i; j > 1; j--){
            if(a % j == 0 && b % j == 0){
                return j;
            }
        }

        return 1;
    }
}
