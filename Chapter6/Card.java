/* File: Card.java
 * ---------------
 * Implementation of class Card.
 */
package Chapter6;

public class Card  {
	
/**
 * Creates new card with specified parameters.
 * @param rank
 * @param suit
 */
	public Card (String rank, int suit) {
		cardRank = rank;
		cardSuit = suit;
	}
	
/** Gets rank of card
 * @return The rank of the card
 */
	public String getRank() {
		return cardRank;
	}
	
/** Gets suit of card
 * @return The suit of the card
 */
	public int getSuit() {
		return cardSuit;
	}
	
/**
 * Creates a string representation of card
 * @return String representation of card
 */
	public String toString() {
		switch (cardSuit) {
		case 1: return "Ace of " + cardRank;
		case 11: return "Jack of " + cardRank;
		case 12: return "Queen of " + cardRank;
		case 13: return "King of " + cardRank;
		}
		return "ERROR";
	}

/* Private Instance variables */
	
	private String cardRank;
	private int cardSuit;
	
/* Public constants */
	
/** Card Rank */
	public static final String CLUBS = "Clubs";
	public static final String DIAMONDS = "Diamonds";
	public static final String HEARTS = "Hearts";
	public static final String SPADES = "Spades";
	
/** Card Suit */
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

}
