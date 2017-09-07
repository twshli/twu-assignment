package twu;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Shli on 06/09/2017.
 */
public class Diamond {
    private static final String ASTERISK = "*";
    private static final String SPACE = " ";

    public static String getTriangle(int layer) {
        return IntStream.rangeClosed(1, layer)
                .mapToObj(i -> createLayer(layer - i, i * 2 - 1))
                .collect(Collectors.joining("\n"));
    }

    private static String createLayer(int spaceCount, int asteriskCount) {
        return createRepeatedString(SPACE, spaceCount) +
                createRepeatedString(ASTERISK, asteriskCount);
    }

    private static String createRepeatedString(String string, int repeated) {
        return String.join("", Collections.nCopies(repeated, string));
    }
}
