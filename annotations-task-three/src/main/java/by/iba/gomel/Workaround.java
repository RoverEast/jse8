package by.iba.gomel;

import java.lang.annotation.Repeatable;

/**
 * annotation
 */
@Repeatable(Notes.class)
public @interface Workaround {
    /**
     * author
     *
     * @return author
     */
    String author() default "unknown";

    /**
     * defectNumber
     *
     * @return defect number
     */
    int defectNumber() default 0;

    /**
     * releaseNumber
     *
     *
     * @return release Number
     */
    int releaseNumber() default 0;
}
