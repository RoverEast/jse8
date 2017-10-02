package by.iba.gomel;

/**
 * card class
 */
public class Card {
    private String rank;
    private String suit;

    /**
     * constructor with params
     * 
     * @param rank
     *            card rank
     * @param suit
     *            card suit
     */
    public Card(String rank, String suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * empty constructor
     */
    public Card() {
        // empty
    }

    /**
     * get rank
     * 
     * @return rank
     */
    public final String getRank() {
        return this.rank;
    }

    /**
     * get suit
     * 
     * @return suit
     */
    public final String getSuit() {
        return this.suit;
    }

    /**
     * toString
     */
    @Override
    public final String toString() {
        return "Card [rank=" + this.rank + ", suit=" + this.suit + "]";
    }

}
