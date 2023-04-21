package org.example;

public class BlackJack {
    public static void main(String[] args) {

    }

    public static int parseCard(String card) {
        int parsedInt = 0;
        switch (card) {
            case "ace":
                parsedInt = 11;
                break;
            case "two":
                parsedInt = 2;
                break;
            case "three":
                parsedInt = 3;
                break;
            case "four":
                parsedInt = 4;
                break;
            case "five":
                parsedInt = 5;
                break;
            case "six":
                parsedInt = 6;
                break;
            case "seven":
                parsedInt = 7;
                break;
            case "eight":
                parsedInt = 8;
                break;
            case "nine":
                parsedInt = 9;
                break;
            case "ten", "jack", "queen", "king":
                parsedInt = 10;
                break;
            case "other":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + card);
        }
        return parsedInt;
    }

    public static boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) {
            return "P";
        } else if (dealerScore == 11 || dealerScore == 10) {
            return "S";
        } else {
            return "W";
        }
    }

    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else if (dealerScore < 7){
            return "S";
        } else
            return "H";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public static String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}