public class ex4 {
    public static int first(int a, int b, int c){
        return a + b + c;
    }

    public static int second(int a, int b, int c){
        return (a + b) % c;
    }

    public static int third(int a, int b, int c, int d){
        return a + b * ( c / d );
    }

    public static int fourth(int a, int b, int c, int d, int e, int f, int g){
        return a + b / ( c * d ) - e * ( f % g);
    }

    public static void main(String[] args){

        int firstValue = first(-10, 3, 7);
        int secondValue = second(34, 5, 3);
        int thirdValue = third(20, -3, 5, 2);
        int fourthValue =  fourth(5, 25, 5, 2, 6, 8, 2);

        System.out.println(firstValue);
        System.out.println(secondValue);
        System.out.println(thirdValue);
        System.out.println( fourthValue);

    }
    
}
