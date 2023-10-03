import Utils.Utils;


public class ex3Curs {
    public static void main(String[] args){

        System.out.println("tastati prima valoare a= ");
        int a = Utils.scanner().nextInt();

        System.out.println("tastati prima valoare b= ");
        int b = Utils.scanner().nextInt();

        swap(a, b);

        System.out.println("Valorile interschimbate sunt a=" + a + " si b=" +b);


    }

    public static void swap(int a, int b){
        int aux = a;
        a = b;
        b = a;
    }
}