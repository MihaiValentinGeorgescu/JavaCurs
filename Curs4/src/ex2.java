import Utils.Utils;

public class ex2 {
    public static void main(String[] args) {
        System.out.print("Tastati valoarea a= ");
        int a = Utils.scanner().nextInt();
        int k=0;
        for (int i = 1 ; i <= a ; i ++){
            if ( a % i == 0){
                ++k;
            }
        }

        if(k==2)
            System.out.println("numarul este prim deoarece are " + k + " divizori");
    }
}
