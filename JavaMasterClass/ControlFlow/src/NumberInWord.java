import Utils.Utils;

public class NumberInWord {
    public static void main(String[] args){
        System.out.println("Dati numarul intre 1 si 9 (obtional)");
        int numar = Utils.scanner().nextInt();

        printNumberInWord(numar);
    }

    public static void printNumberInWord(int number){


        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("Unu");
                break;
            case 2:
                System.out.println("Doi");
                break;
            case 3:
                System.out.println("Trei");
                break;
            case 4:
                System.out.println("Patru");
                break;
            case 5:
                System.out.println("Cinci");
                break;
            case 6:
                System.out.println("Sase");
                break;
            case 7:
                System.out.println("Sapte");
                break;
            case 8:
                System.out.println("opt");
                break;
            case 9:
                System.out.println("Noua");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

    }
}
