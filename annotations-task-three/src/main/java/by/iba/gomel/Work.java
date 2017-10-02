package by.iba.gomel;

/**
 * Work class
 */
public class Work {

    /**
     * constructor
     *
     */
    public Work() {
        // empty
    }

    /**
     * checkWork
     *
     * @return 1
     */
    @Workaround
    @Workaround(defectNumber = 1, releaseNumber = 1, author = "Marl")
    public final int checkWork() {
        return 1;
    }

}
