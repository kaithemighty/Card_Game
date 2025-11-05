package Week_7.model;
import java.util.*;

/* 
 * Name: Sekai Cuperus
 * Class: Computer Science 2
 * Instructor: Darrell Criss
 * Assignment: Week 7 - Card Game
 * Purpose: Create a Card Game using java, demonstrate use of git
 *          and OOP concepts
 */

public class Deck {

    // create vars
    private final List<Card> deck;
    private int currentCard;
    private static final int NUM_CARDS = 52;
    private static final Random random = new Random();
    
    // constructor
    public Deck() {
        // create deck arrays for card numbers and suits
        String[] cardNumbers = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        // initialize deck
        deck = new ArrayList<>();

        for (String suit : suits) {
            for (int i = 0; i < cardNumbers.length; i++) {
                int value = i + 1;
                if (value > 10) {
                    value = 10; // face cards are worth 10
                }
                deck.add(new Card(cardNumbers[i], suit, value));
            }
        }
        currentCard = 0;
    }

    // shuffle method
    public void shuffle() {
        Collections.shuffle(deck, random);
        currentCard = 0;
    }

    // deal card method
    public Card dealCard() {
        if (currentCard < deck.size()) {
            return deck.get(currentCard++);
        } else {
            return null; // no more cards to deal
        }
    }
}
