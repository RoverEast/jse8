package by.iba.gomel;

/**
 * FullName class
 */
public class FullName {

    private final String fullN;

    /**
     * FullName
     *
     * @param fullN
     *            full name
     */
    public FullName(final String fullN) {
        super();
        this.fullN = fullN;
    }

    /**
     * takeInitials
     *
     * @return Initials
     */
    public final String takeInitials() {
        final int lastNameStart = this.fullN.indexOf(' ') + 1;
        final StringBuilder sb = new StringBuilder();
        if (this.fullN.length() == 0) {
            sb.append("name not found");
        } else if (this.fullN.indexOf(' ') == -1) {
            sb.append("full name not found");
        } else {
            sb.append(this.fullN.charAt(0)).append('.').append(this.fullN.charAt(lastNameStart));
        }
        return sb.toString();
    }
}
