package by.iba.gomel;

/**
 * PasswordChecker class
 */
public class PasswordChecker {
    private static final int FIVE = 5;
    private final String password;
    private char[] pass;
    private int lowerCaseletterCounter;
    private int upperCaseletterCounter;
    private int digitCounter;

    /**
     * constructor
     */
    public PasswordChecker() {
        this("");
    }

    /**
     * constructor
     *
     * @param password
     *            password
     */
    public PasswordChecker(final String password) {
        this.password = password;
    }

    /**
     * checkPassword
     *
     * @return result
     */
    public boolean checkPassword() {
        this.counter();
        return (this.upperCaseletterCounter > 0) && (this.lowerCaseletterCounter > 0)
                && (this.digitCounter > 0) && (this.pass.length > PasswordChecker.FIVE);

    }

    private void counter() {
        this.takeArray();
        for (final char pas : this.pass) {
            if (Character.isUpperCase(pas)) {
                this.upperCaseletterCounter++;
            }
            if (Character.isLowerCase(pas)) {
                this.lowerCaseletterCounter++;
            }
            if (Character.isDigit(pas)) {
                this.digitCounter++;
            }
        }
    }

    private void takeArray() {
        this.pass = this.password.toCharArray();
    }
}
