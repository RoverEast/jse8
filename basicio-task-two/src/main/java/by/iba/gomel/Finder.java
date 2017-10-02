package by.iba.gomel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class Finder
 */
public class Finder {

    /**
     * Logger.
     *
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Finder.class);

    private final StringBuilder stringBuilder = new StringBuilder();

    /**
     * Finder constructor
     */
    public Finder() {
        // empty
    }

    /**
     * takeInt meth
     *
     * @param fileName
     *            file Name
     * @return ret result
     */
    public String takeInt(final String fileName) {
        this.readFile(fileName);
        this.findPosition();
        if (this.findPosition() == (this.stringBuilder.length() - 1)) {
            return this.stringBuilder.substring((int) this.findPosition());
        } else if ((this.findPosition() > 0)
                && (this.findPosition() != this.stringBuilder.length())) {
            return this.stringBuilder.substring((int) this.findPosition(),
                    this.stringBuilder.indexOf(" ", (int) this.findPosition()));
        }
        return "did not find";
    }

    private long findPosition() {
        final Pattern pattern = Pattern.compile("^\\d+");
        final Matcher matcher = pattern.matcher(this.stringBuilder.toString());
        if (matcher.find()) {
            return Integer.parseInt(matcher.group());
        }
        return -1;
    }

    private void readFile(final String fileName) {
        try (FileInputStream input = new FileInputStream(fileName)) {
            int data = input.read();
            while (data != -1) {
                this.stringBuilder.append((char) data);
                data = input.read();
            }
        } catch (final IOException e) {
            Finder.LOGGER.info(e.getMessage(), e);
        }
    }
}
