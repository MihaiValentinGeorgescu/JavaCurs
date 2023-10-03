package PigLatin;

public class aVeryLostMainFunction {
    public static void main(String[] args) {
        Rule1 regula1 = new Rule1();

        String wordToProcess = "apple";
        char[] result = Rule1.metodaRegula1(wordToProcess);
        System.out.println("Processed word: " + new String(result));
    }
}
