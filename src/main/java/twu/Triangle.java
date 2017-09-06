package twu;

import java.util.Collections;

/**
 * Created by Shli on 06/09/2017.
 */
public class Triangle {

    private static final String STRING_ASTERISK = "*";

    public static String getOneAsterisk() {
        return STRING_ASTERISK;
    }

    public static String getHorizontalAsteriskLine(int length) {
        return String.join("", Collections.nCopies(length, STRING_ASTERISK));
    }

    public static String getVerticalAsteriskLine(int length) {
        return String.join("\n", Collections.nCopies(length, STRING_ASTERISK));
    }

    public static void main(String[] args) {
        System.out.println(Triangle.getOneAsterisk());
        System.out.println(Triangle.getHorizontalAsteriskLine(8));
    }
}
