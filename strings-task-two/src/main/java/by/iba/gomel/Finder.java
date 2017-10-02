package by.iba.gomel;

import java.util.ArrayList;

/**
 * Finder
 */
public class Finder {
    private static final String SPACE = " ";
    private final String sentence;
    private final String givenWord;
    private final ArrayList<String> al = new ArrayList<>();

    /**
     * constructor
     *
     * @param sentence
     *            sentence
     * @param givenWord
     *            givenWord
     */
    public Finder(final String sentence, final String givenWord) {
        this.sentence = sentence;
        this.givenWord = givenWord;
    }

    /**
     * findWords
     *
     * @return words
     */
    public String findWords() {
        this.takeWords();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.al.size(); i++) {
            if (this.al.get(i).length() > this.givenWord.length()) {
                continue;
            }
            if (this.givenWord.contains(this.al.get(i))) {
                sb.append(this.al.get(i)).append(Finder.SPACE);
            }
        }

        return sb.toString();
    }

    /**
     * deleteDuplicates
     */
    private void deleteDuplicates() {
        for (int i = 0; i < this.al.size(); i++) {
            for (int j = 0; j < this.al.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (this.al.get(i).equals(this.al.get(j))) {
                    this.al.remove(j);
                }
            }
        }
    }

    /**
     * takeWords
     */
    private void takeWords() {
        for (final String retval : this.sentence.split(" ")) {
            this.al.add(retval);
            this.deleteDuplicates();
        }
    }
}
