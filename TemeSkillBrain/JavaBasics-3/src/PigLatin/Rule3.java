package PigLatin;

public class Rule3 extends BigBoiClass{
    public String metodaRegula3(String input) {

        String new_word = "";
        if (startsWithConsonantQu(input)) {
            String prefix = input.substring(0, 3);
            new_word = input.substring(3);
            new_word = new_word + prefix + "ay";
        }
        return new_word;
    }
}
