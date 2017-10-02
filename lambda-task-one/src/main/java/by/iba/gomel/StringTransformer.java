package by.iba.gomel;

import java.util.function.IntSupplier;

/**
 * StringTransformer interface
 */
@FunctionalInterface
public interface StringTransformer extends IntSupplier {

    /**
     * override getAsBoolean
     */
    @Override
    default int getAsInt() {
        return 1;
    }

    /**
     * transform method
     *
     * @param s
     *            input string
     * @return result string
     */
    String transform(String s);
}
