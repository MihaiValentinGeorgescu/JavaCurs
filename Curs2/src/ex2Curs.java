import Utils.Utils;


public class ex2Curs {
    public static void main(String[] args){

        System.out.println("tastati prima valoare a= ?");
        int a = Utils.scanner().nextInt();

        System.out.println("tastati prima valoare b= ?");
        int b = Utils.scanner().nextInt();

        a = a + b;
        b = a - b;
        a = a -b;

        System.out.println(a);
        System.out.println(b);
    }
}