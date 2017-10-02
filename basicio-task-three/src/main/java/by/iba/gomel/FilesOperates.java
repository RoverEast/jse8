package by.iba.gomel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class FilesOperates
 */
public class FilesOperates {

    /**
     * Logger.
     * <p>
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(FilesOperates.class);

    private static final Scanner IN = new Scanner(System.in, "utf-8");

    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private String name;
    private String text;

    /**
     * FilesOperates constructor
     */
    public FilesOperates() {
        // empty
    }

    /**
     * createFile meth
     *
     * @param fileName
     *            file Name
     * @param message
     *            input message
     * @return ret result
     */
    public String createFile(final String fileName, final String message) {
        final File file = new File(fileName);
        if (!file.exists()) {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                final byte[] buffer = message.getBytes(Charset.forName("UTF-8"));
                fos.write(buffer, 0, buffer.length);

            } catch (final IOException e) {
                FilesOperates.LOGGER.info(e.getMessage(), e);
            }

            return "ok";
        }
        return "not ok";
    }

    /**
     * deleteFile meth
     *
     * @param fileName
     *            file Name
     * @return ret result
     */
    public String deleteFile(final String fileName) {
        final File file = new File(fileName);
        if (file.delete()) {
            return "File deleted";
        }
        return "File did not deleted";
    }

    /**
     * readFile meth
     *
     * @param fileName
     *            file Name
     * @return ret result
     */
    public String readFile(final String fileName) {

        final StringBuilder stringBuilder = new StringBuilder();
        final File file = new File(fileName);
        if (file.exists()) {
            try (FileInputStream input = new FileInputStream(file)) {
                int data = input.read();
                while (data != -1) {
                    stringBuilder.append((char) data);
                    data = input.read();
                }
            } catch (final IOException e) {
                stringBuilder.append("");
                FilesOperates.LOGGER.info(e.getMessage(), e);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * work meth
     *
     * @param state
     *            some var
     */
    @SuppressWarnings("unused")
    private String work() {
        final StringBuilder sb = new StringBuilder();
        boolean exit = false;
        while (!exit ) {
            this.viewMenu();
            switch (FilesOperates.IN.nextInt()) {
            case 1:
                this.first();
                break;
            case TWO:
                this.second();
                break;
            case THREE:
                this.third();
                break;
            case FOUR:
                exit = true;
                break;
            default:
                FilesOperates.LOGGER.info("Wrong number");
            }
        }
        FilesOperates.IN.close();
        return sb.toString();
    }

    private final boolean accept() {

        FilesOperates.LOGGER.info("Sure y/n?\n");
        return "y".equals(FilesOperates.IN.nextLine());

    }

    private final void first() {
        FilesOperates.IN.nextLine();
        FilesOperates.LOGGER.info("File name: ");
        this.name = FilesOperates.IN.nextLine();
        FilesOperates.LOGGER.info("File text: ");
        this.text = FilesOperates.IN.nextLine();
        if (this.accept()) {
            FilesOperates.LOGGER.info(this.createFile(this.name, this.text));
        }
    }

    private final void second() {
        FilesOperates.IN.nextLine();
        FilesOperates.LOGGER.info("File name: ");
        this.name = FilesOperates.IN.nextLine();
        if (this.accept()) {
            FilesOperates.LOGGER.info(this.deleteFile(this.name));
        }
    }

    private final void third() {
        FilesOperates.IN.nextLine();
        FilesOperates.LOGGER.info("File name: ");
        this.name = FilesOperates.IN.nextLine();
        if (this.accept()) {
            FilesOperates.LOGGER.info(this.readFile(this.name));
        }
    }

    private final void viewMenu() {
        FilesOperates.LOGGER.info("\n1 create file\n2 delete file\n3 view file\n4 exit\n");

    }
}
