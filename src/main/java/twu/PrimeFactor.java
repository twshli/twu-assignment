package twu;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Shli on 08/09/2017.
 */
public class PrimeFactor {

    public static List<Integer> getPrimes(int maxNum) {
        List<Integer> primes = new LinkedList<>();

        if (maxNum <= 1) {
            return primes;
        }
        primes.add(2);

        return primes;
    }
}
