package Week_7.manager;
import Week_7.model.*;
import java.util.Scanner;


/* 
 * Name: Sekai Cuperus
 * Class: Computer Science 2
 * Instructor: Darrell Criss
 * Assignment: Week 7 - Card Game
 * Purpose: Create a Card Game using java, demonstrate use of git
 *          and OOP concepts
 */

public class Blackjack {

    // create variables
    private Deck deck;
    private int playerScore;
    private int dealerScore;

    // constructor
    public Blackjack() {
        deck = new Deck();
        deck.shuffle();
        playerScore = 0;
        dealerScore = 0;
    }

    // main game method
    public void playGame() {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // initial deal
        playerScore += deck.dealCard().getValue();
        playerScore += deck.dealCard().getValue();
        dealerScore += deck.dealCard().getValue();
        dealerScore += deck.dealCard().getValue();

        // state the scores
        System.out.println("Player's card value: " + playerScore);
        System.out.println("Dealer's card value: " + dealerScore);

        // player's turn
        String choice;
        do {
            System.out.print("Hit or Stand? (Type 'hit' or 'stand'): ");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("hit")) {
                Card newCard = deck.dealCard();
                playerScore += newCard.getValue();
                System.out.println("You drew: " + newCard);
                System.out.println("Player's card value: " + playerScore);
            } 
        } while (choice.equals("hit"));

        // dealer's turn
        while (dealerScore < 17) {
            Card dealerCard = deck.dealCard();
            dealerScore += dealerCard.getValue();
        }
        System.out.println("Dealer's card value: " + dealerScore);

        // determine winner
        if (playerScore > 21) {
            System.out.println("Player busts! Dealer wins.");
        } else if (dealerScore > 21) {
            System.out.println("Dealer busts! You win.");
        } else if (playerScore > dealerScore) {
            System.out.println("You win!");
        } else if (dealerScore > playerScore) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
        // close scanner
        scanner.close();
    }
}
