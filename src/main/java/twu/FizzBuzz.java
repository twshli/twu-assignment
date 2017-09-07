package twu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Shli on 07/09/2017.
 */
public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String getAliases(int startNum, int endNum) {
        return IntStream.rangeClosed(startNum, endNum)
                .mapToObj(FizzBuzz::getAlias)
                .collect(Collectors.joining("\n"));
    }

    public static String getAlias(int num) {
        String alias = "";

        alias += (isDivisible(num, 3) ? FIZZ : "");
        alias += (isDivisible(num, 5) ? BUZZ : "");

        return (alias.isEmpty() ? String.valueOf(num) : alias);
    }

    private static boolean isDivisible(int number, int divisor) {
        return (number % divisor == 0);
    }
}
