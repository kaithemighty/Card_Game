package Week_7.model;

/* 
 * Name: Sekai Cuperus
 * Class: Computer Science 2
 * Instructor: Darrell Criss
 * Assignment: Week 7 - Card Game
 * Purpose: Create a Card Game using java, demonstrate use of git
 *          and OOP concepts
 */

public class Card {
    // create variables
    private final String face;
    private final String suit;
    private final int value;

    // constructor
    public Card(String face, String suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
    }

    // getter method for value
    public int getValue() {
        return value;
    }

    // toString method for use later
    public String toString() {
        return face + " of " + suit;
    }
}
