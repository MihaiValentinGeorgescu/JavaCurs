import Utils.Utils;
import com.sun.source.doctree.SummaryTree;

public class FirstAndLastDigit {
    public static void main(String[] args){
        System.out.print("scrieti numarul: ");
        int numar = Utils.scanner().nextInt();

        System.out.println("Suma ultimelor 2 cifre este = " + sumFirstAndLastDigit(numar));

    }

    public static int sumFirstAndLastDigit(int numar){

        int firstDigit = numar % 10;
        int nrZerouri = countDigits(numar);
        int pozitieUltimaCifra = (int) Math.pow(10, nrZerouri);
        int lastDigit = numar / (pozitieUltimaCifra/10);
        int suma = lastDigit + firstDigit;

        return suma;
    }

    public static int countDigits(int number) {

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
