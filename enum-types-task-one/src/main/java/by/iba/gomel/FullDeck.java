package by.iba.gomel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class FullDeck
 */
public class FullDeck {

    private final List<Card> cs = new ArrayList<>();
    private final List<Suit> suits = Arrays.asList(Suit.values());
    private final List<Rank> ranks = Arrays.asList(Rank.values());

    /**
     * getFullDeckSize meth
     *
     * @return Deck Size
     */
    public final int getFullDeckSize() {
        return this.cs.size();
    }

    /**
     * initDeck meth
     */
    public final void initDeck() {
        for (int i = 0; i < this.suits.size(); i++) {
            for (int j = 0; j < this.ranks.size(); j++) {
                this.cs.add(new Card(this.suits.get(i).toString(), this.ranks.get(j).toString()));
            }
        }
    }
}
