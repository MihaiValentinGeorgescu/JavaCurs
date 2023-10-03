package PigLatin;

public class BigBoiClass {

    int nrConsoaneConsecutive(String input){
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

    static char[] stringToArray(String input){
        char[] inputToArray = new char[input.length()];

        for(int i = 0 ;i <= input.length()-1; i++){
            inputToArray[i] = input.charAt(i);
        }
        return inputToArray;
    }

    static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(String.valueOf(ch));
    }

    static boolean checkXRandYT(String word) {
        String firstTwoChars = word.substring(0, 2).toLowerCase();
        if(firstTwoChars.equals("xr") || firstTwoChars.equals("yt") || isVowel(word.charAt(0))){
            return true;
        }else{
            return false;
        }
        //return firstTwoChars.equals("xr") || firstTwoChars.equals("yt") || isVowel(word.charAt(0));
    }
     boolean startsWithConsonantQu(String word) {
        String firstThreeChars = word.substring(0, 3).toLowerCase();
        return firstThreeChars.equals((isConsonant(word.charAt(0)) && word.charAt(1) == 'q' && word.charAt(2) == 'u'));
    }

    boolean isConsonant(char ch) {
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return consonants.contains(String.valueOf(ch));
    }

}
