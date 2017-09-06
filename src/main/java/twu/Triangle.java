package twu;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Shli on 06/09/2017.
 */
public class Triangle {

    private static final String STRING_ASTERISK = "*";

    public static String getOneAsterisk() {
        return STRING_ASTERISK;
    }

    public static String getHorizontalAsteriskLine(int length) {
        return joinRepeatedString(STRING_ASTERISK, length, "");
    }

    public static String getVerticalAsteriskLine(int length) {
        return joinRepeatedString(STRING_ASTERISK, length, "\n");
    }

    public static String getAsteriskTriangle(int layer) {
        return IntStream.range(1, layer + 1)
                .mapToObj(Triangle::getHorizontalAsteriskLine)
                .collect(Collectors.joining("\n"));
    }

    private static String joinRepeatedString(String repeatedString, int count, String delimiter) {
        return String.join(delimiter, Collections.nCopies(count, repeatedString));
    }

    public static void main(String[] args) {
        System.out.println("Draw one asterisk: ");
        System.out.println(Triangle.getOneAsterisk());

        System.out.println("Draw a horizontal line: ");
        System.out.println(Triangle.getHorizontalAsteriskLine(8));

        System.out.println("Draw a vertical line: ");
        System.out.println(Triangle.getVerticalAsteriskLine(3));

        System.out.println("Draw a right triangle: ");
        System.out.println(Triangle.getAsteriskTriangle(3));
    }
}
