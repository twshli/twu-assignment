package twu;

/**
 * Created by Shli on 07/09/2017.
 */
public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String getAlias(int num) {
        if (num % 3 == 0) {
            return FIZZ;
        }

        if (num % 5 == 0) {
            return BUZZ;
        }

        return String.valueOf(num);
    }
}
