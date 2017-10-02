package by.iba.gomel;

/**
 * deck class
 */
public class Deck {

    /**
     * array of suits
     */
    protected static final String[] SUIT       = {"heart", "diamond", "club", "spade"};
    /**
     * array of ranks
     */
    protected static final String[] RANK       = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
            "Q", "K", "A"};
    /**
     * demention
     */
    public final Card[]      singleCard = new Card[1 + (SUIT.length * RANK.length)];

    /**
     * empty constructor
     */
    public Deck() {
        // empty
    }

    /**
     * initialize deck
     */
    public final void initDeck() {
        int k = 1;
        for (int i = 0; i < SUIT.length; i++) {
            for (int j = 0; j < RANK.length; j++) {
                this.singleCard[k] = new Card(RANK[j], SUIT[i]);
                k++;
            }
        }
    }

    /**
     * take card from deck
     * 
     * @param number
     *            number card
     * @return card
     */
    public final String takeCard(int number) {
        return "Card [rank=" + this.singleCard[number].getRank() + ", suit="
                + this.singleCard[number].getSuit() + "]";
    }
}
