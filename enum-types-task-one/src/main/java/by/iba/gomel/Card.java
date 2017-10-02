package by.iba.gomel;

/**
 * class Card
 */
public class Card {

    private final String rank;
    private final String suit;

    /**
     * Card constructor
     *
     * @param rank
     *            Card rank
     * @param suit
     *            Card suit
     */
    public Card(final String rank, final String suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * getRank meth
     *
     * @return Card rank
     */
    public final String getRank() {
        return this.rank;
    }

    /**
     * getSuit meth
     *
     * @return Card suit
     */
    public final String getSuit() {
        return this.suit;
    }

    /**
     * toString meth
     */
    @Override
    public final String toString() {
        return "Card [rank=" + this.rank + ", suit=" + this.suit + "]";
    }

}
