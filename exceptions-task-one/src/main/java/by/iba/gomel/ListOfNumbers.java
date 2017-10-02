package by.iba.gomel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.net.SocketException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ListOfNumbers
 */
public class ListOfNumbers {
    /**
     * Logger.
     *
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ListOfNumbers.class);
    private static final int SIZE = 10;
    private static final int TWO = 2;
    private static final String SPACE = " ";
    private final ArrayList<Serializable> al;
    private RandomAccessFile file;

    /**
     * constructot
     *
     */
    public ListOfNumbers() {
        // сонар не позволяет использовать вектор
        this.al = new ArrayList<>(ListOfNumbers.SIZE);
        for (int i = 0; i < ListOfNumbers.SIZE; i++) {
            this.al.add(i);
        }
    }

    /**
     * getAl
     *
     * @return String
     */
    public String getAl() {
        return this.al.get(this.al.size() - ListOfNumbers.TWO).toString();
    }

    /**
     * readList
     *
     * @param s
     *            file name
     */
    public void readList(final String s) throws IOException {
        this.file = new RandomAccessFile(s, "r");
        final StringBuilder sb = new StringBuilder();
        int b = this.file.read();
        while (b != -1) {
            sb.append(b);
            b = this.file.read();
        }
        for (final String retval : sb.toString().split(ListOfNumbers.SPACE)) {
            this.al.add(retval);
        }
        this.file.close();
    }

    /**
     * writeList
     *
     * @param s
     *            mode
     */
    public void writeList(final String s) {
        try (RandomAccessFile file1 = new RandomAccessFile("OutFilee.txt", s)) {
            file1.write(1);
            ListOfNumbers.LOGGER.info("Entering try statement writeList\n");
            this.file = new RandomAccessFile("OutFile.txt", "rw");
            for (int i = 0; i < ListOfNumbers.SIZE; i++) {
                this.file.writeChars("" + this.al.get(i));
            }
            this.file.close();
        } catch (FileNotFoundException | SocketException e) {
            ListOfNumbers.LOGGER.info(ListOfNumbers.SPACE + e.getMessage(), e);
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            ListOfNumbers.LOGGER.info(e.getMessage(), e);
        } finally {
            if (this.file == null) {
                ListOfNumbers.LOGGER.info("PrintWriter not open\n");
            } else {
                ListOfNumbers.LOGGER.info("Closing PrintWriter\n");
            }
        }
    }

}
