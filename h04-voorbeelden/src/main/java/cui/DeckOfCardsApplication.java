package cui;

import domein.Card;
import domein.DeckOfCards;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCardsApplication {

    void main() {
        new DeckOfCardsApplication().makeDeckAndGiveCards();
    }

    private void makeDeckAndGiveCards() {
        DeckOfCards deck = new DeckOfCards(); // <.>
        IO.println("Before dealing: the fresh deck of cards contains " + deck.giveNumberOfCards() + " cards.");

        // <.>
        List<Card> handPlayer1 = new ArrayList<>();
        List<Card> handPlayer2 = new ArrayList<>();

        // <.>
        for (int i = 0; i < 8; i++) {
            handPlayer1.add(deck.dealCard());
            handPlayer2.add(deck.dealCard());
        }

        showHand("Player 1", handPlayer1);
        showHand("Player 2", handPlayer2);

        System.out.println("\nAfter dealing: the deck of cards now contains " + deck.giveNumberOfCards() + " cards.%n");
    }

    private void showHand(String playerName, List<Card> cards) {
        IO.println(String.format("%nHand of %S", playerName));
        for (Card card : cards) {
            IO.println(String.format("- %s", card));
        }
    }
}
