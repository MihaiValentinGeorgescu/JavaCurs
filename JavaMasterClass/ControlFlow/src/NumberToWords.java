public class NumberToWords {
    public static void main(String[] args) {
        int numar = 653342;
        System.out.println(Conversie(numar));
    }

    public static int NrCifre(int numar){
        int k = 0;
        while( numar != 0 ){
            k = k + 1;
            numar = numar / 10;
        }

        return k;
    }

    public static String NumeCifre(int cifra){

        switch (cifra){
            case 1:
                return " unu ";
            case 2:
                return " doi ";
            case 3:
                return " trei ";
            case 4:
                return " patru ";
            case 5:
                return " cinci ";
            case 6:
                return " sase ";
            case 7:
                return " sapte ";
            case 8:
                return " opt ";
            case 9:
                return " noua ";
            default:
                return "necunoscut";
        }
    }

    public static String NumeZecimi(int cifre){

        switch (cifre){
            case 1:
                return " ";
            case 2:
                return " zeci ";
            case 3:
                return " sute ";
            case 4:
                return " mii ";
            case 5:
                return " zeci de mii ";
            case 6:
                return " sute de mii ";
            case 7:
                return " milioane ";
            case 8:
                return " zeci de milioane ";
            case 9:
                return " sute de milioane ";
            default:
                return "necunoscut";
        }
    }

    public static String Conversie(int numar){

        //String rezultat = "";
        //int nrCifre = NrCifre(numar);
        //int cifra = numar % 10;

        //String numeZecimi = NumeZecimi(nrCifre);
        //String numeCifre = NumeCifre(cifra);

        //while( numar != 0 ){

        //}

        String rezultat = "";

        if (numar == 0) {
            return "zero";
        }

        int nrCifre = NrCifre(numar);

        while (numar != 0) {
            int cifra = numar % 10;

            if (cifra != 0) {
                String numeCifre = NumeCifre(cifra);
                String numeZecimi = NumeZecimi(nrCifre);

                rezultat = rezultat + numeCifre + numeZecimi;
            }

            numar = numar / 10;
            nrCifre--;

            // Add "si" for numbers with more than one digit
            //if (numar != 0 && numar % 10 != 0) {
            if(NrCifre(numar)==1){
                rezultat =  rezultat + " si ";
            }
        }

        return rezultat.trim(); // Trim to remove leading/trailing spaces
    }
}
