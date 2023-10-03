import java.util.Scanner;

public class Tema1Partea1 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        String[] sentence = new String[5];

        for (int i = 0; i < sentence.length; i++) {
            System.out.print("Write sentence number " + (i+1) + ": ");
            sentence[i] = scanner.nextLine();
        }

        scanner.close();

        System.out.println("\nThese are your sentences");
        for (int i =0; i <= sentence.length; i++) {
            System.out.println("Sentence " + (i+1) + ": " + sentence[i]);
        }
    }
}