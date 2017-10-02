package by.iba.gomel;

import java.lang.annotation.Documented;

/**
 * annotation
 */
@Documented
public @interface Annot {
    /**
     * date
     *
     * @return String
     */
    String date() default "unknown";

    /**
     * engineer
     *
     * @return String
     */
    String engineer() default "unassigned";

    /**
     * id
     *
     * @return int
     */
    int id();

    /**
     * synopsis
     *
     * @return String
     */
    String synopsis();
}
