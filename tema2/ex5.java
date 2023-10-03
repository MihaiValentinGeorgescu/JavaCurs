import java.util.Scanner;

public class ex5 {
    public static int sum(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int remainder(int a, int b){
        return a % b;
    }

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        int sumValue = sum(a, b);
        int multiplyValue = multiply(a, b);
        int subtractValue = subtract(a, b);
//        int divideValue =  divide(a, b);
//        int remainderValue = remainder(a, b);

        System.out.println("Sum of those values is" + sumValue );
        System.out.println("Multiplication by those numbers is " + multiplyValue );
        System.out.println("Subtract by those numbers is" + subtractValue );

        if ( b == 0 ){
            System.out.println("Division and remainder by 0 is impossible");
        }else{
            System.out.println( divide(a, b) );
            System.out.println( remainder(a, b) );
        }

    }
    
}