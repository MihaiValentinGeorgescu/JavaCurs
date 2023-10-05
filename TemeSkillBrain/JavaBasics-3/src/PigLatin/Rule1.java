package PigLatin;

public class Rule1 extends BigBoiClass{
    public String metodaRegula1(String input){
        input = input.toLowerCase();
        char primaLitera = input.substring(0, 1).toLowerCase().charAt(0);

        if(checkXRandYT(input) || isVowel(primaLitera)){
            return input + "ay";
        }

        return "invalid format";
    }
}
