import Utils.Utils;

public class ArmstrongNumber {

    public static void main(String[] args){
        System.out.print("La cate cifre maxim dorim sa ajungem cu numerele lui Armstrong? ");
        long nrCifreNumar = Utils.scanner().nextLong();
        long nrNumere = (long) Math.pow(10, nrCifreNumar);

        if(nrCifreNumar > 4) {
            System.out.println("Vezi ca imi bubuie procesoru");
        }else {
            for (long i = 0; i <= nrNumere; i++) {
                if (checkArmstrongNumebr(i)) {
                    System.out.println("numarul " + i + " este al lui Armstrong trebuie inapoiat");
                }
            }
        }

    }

    public static boolean checkArmstrongNumebr(long number){

        long suma = 0;
        long initialNumber = number;
        int digits = countDigits(number);

        while (number != 0) {
            suma = suma + (long) Math.pow((number % 10), digits);
            number /= 10;
        }

        if (suma == initialNumber){
            return true;
        }else{
            return false;
        }
    }

    public static int countDigits(long number) {

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
