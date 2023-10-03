package PigLatin;

public class tests {
    public static void main(String[] args) {
        String input = "HelloWorld";
        int n = 4;
        String result = moveFirstLettersToBack(input, n);
        System.out.println(result);

        int result2 = nrConsoaneConsecutive(input);
        System.out.println(result2);
    }

    public static String moveFirstLettersToBack(String input, int n){
        if( n < 0 || n > input.length()){
            throw new IllegalArgumentException("Invalid value of n");
        }

        String front = input.substring(0, n);
        String back = input.substring(n);
        return back + front;
    }

    public static int nrConsoaneConsecutive(String input){
        int contorConsoaneConsec = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        for(int i = 0; i <= input.length()-1; i++) {
            char literaCurenta = input.charAt(i);
            if (!consonants.contains(String.valueOf(literaCurenta))) {
                break;
            } else {
                if (consonants.contains(String.valueOf(literaCurenta))) {
                    contorConsoaneConsec++;
                }
            }
        }
        return contorConsoaneConsec;
    }

}
