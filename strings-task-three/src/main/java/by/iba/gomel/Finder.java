package by.iba.gomel;

/**
 * Finder
 */
public class Finder {
    private static final String SPACE = " ";
    private final String str;
    private boolean rOpen;
    private boolean sOpen;
    private boolean fOpen;

    /**
     * constructor
     *
     * @param str
     *            input string
     */
    public Finder(final String str) {
        this.str = str;
    }

    /**
     * takeAllText
     *
     * @return string
     */
    public final String takeAllText() {
        final StringBuilder sb1 = new StringBuilder("():");
        sb1.append(this.textR());
        if (this.rOpen && (sb1.length() != 0)) {
            sb1.delete(sb1.toString().lastIndexOf(Finder.SPACE), sb1.length());
        }
        this.allFalse();
        final StringBuilder sb2 = new StringBuilder("[]:");
        sb2.append(this.textS());
        if (this.sOpen && (sb2.length() != 0)) {
            sb2.delete(sb2.toString().lastIndexOf(Finder.SPACE), sb2.length());
        }
        this.allFalse();
        final StringBuilder sb3 = new StringBuilder("{}:");
        sb3.append(this.textF());
        if (this.fOpen && (sb3.length() != 0)) {
            sb3.delete(sb3.toString().lastIndexOf(Finder.SPACE), sb3.length());
        }
        this.allFalse();
        return sb1.toString() + "\n" + sb2.toString() + "\n" + sb3.toString();
    }

    private void allFalse() {
        this.rOpen = false;
        this.fOpen = false;
        this.sOpen = false;
    }

    private void fAdd(final int i, final StringBuilder sb) {
        if (this.fOpen && !this.sOpen && !this.rOpen) {
            sb.append(this.str.charAt(i));
        }
    }

    private void rAdd(final int i, final StringBuilder sb) {
        if (this.rOpen && !this.sOpen && !this.fOpen) {
            sb.append(this.str.charAt(i));
        }
    }

    private void sAdd(final int i, final StringBuilder sb) {
        if (this.sOpen && !this.rOpen && !this.fOpen) {
            sb.append(this.str.charAt(i));
        }
    }

    private String textF() {
        final StringBuilder sb = new StringBuilder();
        this.sOpen = true;
        this.rOpen = true;
        boolean checker = false;
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) == '(') {
                checker = true;
                this.rOpen = true;
            } else if (this.str.charAt(i) == ')') {
                checker = true;
                this.rOpen = false;
            } else if (this.str.charAt(i) == '[') {
                this.sOpen = true;
                checker = true;
            } else if (this.str.charAt(i) == ']') {
                this.sOpen = false;
                checker = true;
            } else if (this.str.charAt(i) == '{') {
                this.fOpen = true;
                this.sOpen = false;
                this.rOpen = false;
                checker = true;
            } else if (this.str.charAt(i) == '}') {
                this.fOpen = false;
                sb.append(Finder.SPACE);
                checker = true;
            }
            if (checker) {
                checker = false;
                continue;
            }
            this.fAdd(i, sb);
        }
        return sb.toString();
    }

    private String textR() {
        final StringBuilder sb = new StringBuilder();
        this.sOpen = true;
        this.fOpen = true;
        boolean checker = false;
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) == '(') {
                this.rOpen = true;
                this.sOpen = false;
                this.fOpen = false;
                checker = true;
            } else if (this.str.charAt(i) == ')') {
                this.rOpen = false;
                sb.append(Finder.SPACE);
                checker = true;
            } else if (this.str.charAt(i) == '[') {
                this.sOpen = true;
                checker = true;
            } else if (this.str.charAt(i) == ']') {
                checker = true;
                this.sOpen = false;
            } else if (this.str.charAt(i) == '{') {
                checker = true;
                this.fOpen = true;
            } else if (this.str.charAt(i) == '}') {
                checker = true;
                this.fOpen = false;
            }
            if (checker) {
                checker = false;
                continue;
            }
            this.rAdd(i, sb);
        }
        return sb.toString();
    }

    private String textS() {
        final StringBuilder sb = new StringBuilder();
        this.rOpen = true;
        this.fOpen = true;
        boolean checker = false;
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) == '(') {
                checker = true;
                this.rOpen = true;
            } else if (this.str.charAt(i) == ')') {
                this.rOpen = false;
                checker = true;
            } else if (this.str.charAt(i) == '[') {
                this.sOpen = true;
                this.rOpen = false;
                this.fOpen = false;
                checker = true;
            } else if (this.str.charAt(i) == ']') {
                this.sOpen = false;
                sb.append(Finder.SPACE);
                checker = true;
            } else if (this.str.charAt(i) == '{') {
                checker = true;
                this.fOpen = true;
            } else if (this.str.charAt(i) == '}') {
                checker = true;
                this.fOpen = false;
            }
            if (checker) {
                checker = false;
                continue;
            }
            this.sAdd(i, sb);
        }
        return sb.toString();
    }
}
