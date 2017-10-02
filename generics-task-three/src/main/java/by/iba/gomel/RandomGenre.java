package by.iba.gomel;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

/**
 * class RandomGenre
 *
 * @param <T>
 *            param class
 */
public class RandomGenre<T extends Number> {

    private final List<Fictions> fictions = Arrays.asList(Fictions.values());
    private final SecureRandom rand = new SecureRandom();
    private final T numb;

    /**
     * constructor numb is random
     */
    public RandomGenre() {
        this.numb = (T) Integer.valueOf(this.rand.nextInt(this.fictions.size()));
    }

    /**
     * RandomGenre constructor
     *
     * @param numb
     *            genre number
     */
    public RandomGenre(final T numb) {
        this.numb = numb;
    }

    /**
     * takeRandFiction meth
     *
     * @return fiction description
     */
    public final String takeRandFiction() {
        return this.fictions.get((Integer) this.numb).getDescription();
    }

}
