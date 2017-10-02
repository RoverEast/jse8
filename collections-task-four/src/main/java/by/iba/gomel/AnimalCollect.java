package by.iba.gomel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * class AnimalCollect
 */
public class AnimalCollect {

    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int TEN = 10;
    private List<AbstractAnimal> animalCol;

    /**
     * AnimalCollect constructor
     */
    public AnimalCollect() {
        // empty
    }

    /**
     * binSearch meth !!!!Sonar said:"Make this anonymous inner class a lambda".
     *
     * @param size
     *            animal size
     * @return ret animal
     */
    public final String binSearch(final int size) {
        this.sortBySize();
        final int index = Collections.binarySearch(this.animalCol,
                new AbstractAnimal(null, size) {
                    @Override
                    public String move() {
                        return null;
                    }
                }, Comparator.comparingInt(AbstractAnimal::getSize));
        return this.animalCol.get(index).toString();
    }

    /**
     * deleteByColor meth
     *
     * @param color
     *            animal color
     */
    public final void deleteByColor(final String color) {
        final Iterator<AbstractAnimal> it = this.animalCol.iterator();
        while (it.hasNext()) {
            final AbstractAnimal animal = it.next();
            if (animal.getColor().equals(color)) {
                it.remove();
            }
        }
    }

    /**
     * getCollect meth
     *
     * @return ret string
     */
    public final String getCollect() {
        return this.animalCol.toString();
    }

    /**
     * initCol meth
     */
    public final void initCol() {
        this.animalCol = new ArrayList<>();
        this.animalCol.add(new Bird("red", AnimalCollect.TEN));
        this.animalCol.add(new Fish("green", AnimalCollect.NINE));
        this.animalCol.add(new Cat("black", AnimalCollect.EIGHT));
    }

    /**
     * sortBySize meth
     */
    public final void sortBySize() {
        this.animalCol.sort(Comparator.comparingInt(AbstractAnimal::getSize));
    }
}
