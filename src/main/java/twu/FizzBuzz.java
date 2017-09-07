package twu;

/**
 * Created by Shli on 07/09/2017.
 */
public class FizzBuzz {

    private static final String FIZZ = "Fizz";

    public static String getAlias(int num) {
        if (num % 3 == 0) {
            return FIZZ;
        }

        return String.valueOf(num);
    }
}
