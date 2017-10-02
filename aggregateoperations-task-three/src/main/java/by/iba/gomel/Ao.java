package by.iba.gomel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * class AggOpperates
 */
public class Ao {

    private static final int F = 2000;
    private static final int S = 100;
    private static final int THIRD = 1990;
    private final List<Book> books = new ArrayList<>();

    /**
     * AggOpperates constructor
     */
    public Ao() {
        // empty
    }

    /**
     * get Largest Page Number
     *
     * @return ret book with Largest Page Number
     */
    public String getLargestPageNumber() {
        final Stream<Book> s = this.books.stream();
        final Optional<Book> value = s.max(Comparator.comparingInt(Book::a));
        return value.map(String::valueOf).orElse("did not find");
    }

    /**
     * get Number Of Books
     *
     * @return ret number of books with params
     */
    public int getNumberOfBooks() {
        return (int) this.books.stream().filter(p -> ((p.b() < Ao.F) && (p.a() > Ao.S))).count();
    }

    /**
     * get Number Of Same Title
     *
     * @return ret number of books with same title
     */
    public long getNumberOfSameTitle() {
        return this.books.size() - this.books.stream().map(Book::getTitle).distinct().count();
    }

    /**
     * init List
     *
     * @param number
     *            number of books
     */
    public void initList(final int number) {
        for (int i = 0; i < number; i++) {
            this.books.add(new Book(Ao.S + i, String.valueOf(i), Ao.THIRD + i));
        }
    }
}
