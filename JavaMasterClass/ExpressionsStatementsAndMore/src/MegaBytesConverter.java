import Utils.Utils;

public class MegaBytesConverter {
    public static void main(String[] args){
        System.out.println("dati nr de kilo");
        int nrMega = Utils.scanner().nextInt();
        printMegaBytesAndKiloBytes(nrMega);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if ( kiloBytes == 0){
            System.out.println("Invalid input");
        }else{
            int megaBytes = kiloBytes / 1024;
            int remainderOfMegaBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB " + " = " + megaBytes + " MB " + " = " + remainderOfMegaBytes + " remaining KB ");
        }
    }
}
