import Utils.Utils;

public class ex5Curs {
    public static void main(String[] args){

        System.out.print("Tastati valoarea a= ");
        int a = Utils.scanner().nextInt();
        long factor = 1;
        while (a >= 0 ){
            if ( a == 0){
                break;
            }else{
                factor = factor * a ;
            }
            a--;
        }

        System.out.println(factor);
    }
}