package a;

public class BlackJack {
    public static void main(String[] args) {

        BlackJack game = new BlackJack();

        // Example cards for testing
        String card1 = "ten";
        String card2 = "two";
        String dealerCard = "seven";

        // Test parseCard method
        int cardValue = game.parseCard(card1);
        System.out.println("Card value for " + card1 + ": " + cardValue);

        // Test isBlackjack method
        boolean isBlackjack = game.isBlackjack(card1, card2);
        System.out.println("Is it a blackjack hand? " + isBlackjack);

        // Test largeHand and smallHand methods
        int handScore = game.parseCard(card1) + game.parseCard(card2);
        int dealerScore = game.parseCard(dealerCard);

        String largeHandDecision = game.largeHand(isBlackjack, dealerScore);
        System.out.println("Large hand decision: " + largeHandDecision);

        String smallHandDecision = game.smallHand(handScore, dealerScore);
        System.out.println("Small hand decision: " + smallHandDecision);

        // Test firstTurn method
        String firstTurnDecision = game.firstTurn(card1, card2, dealerCard);
        System.out.println("First turn decision: " + firstTurnDecision);

    }

    public static int  parseCard(String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        if( (parseCard(card1) == 10 && parseCard(card2) == 11) || (parseCard(card1) == 11 && parseCard(card2) == 10)){
            return true;
        }else{
            return false;
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if( isBlackjack ){
            if( dealerScore == 10 || dealerScore == 11){
                return "stand";
            }else{
                return "blackJack";
            }
        }else{
            return "stand";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if( handScore >= 17 ){
            return "stand";
        }else{
            if ( handScore <= 11 ){
                return "hit";
            }else{
                if( handScore >= 12 && handScore <= 16 && dealerScore >= 7){
                    return "hit";
                }else{
                    return "stand";
                }
            }
        }
    }


    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
