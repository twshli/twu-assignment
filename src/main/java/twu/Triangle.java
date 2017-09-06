package twu;

import java.util.Collections;

/**
 * Created by Shli on 06/09/2017.
 */
public class Triangle {
    public static String getOneAsterisk() {
        return "*";
    }

    public static String getHorizontalAsteriskLine(int length) {
        return String.join("", Collections.nCopies(length, "*"));
    }

    public static void main(String[] args) {
        System.out.println(Triangle.getOneAsterisk());
    }
}
