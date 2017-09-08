package twu;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shli on 08/09/2017.
 */
public class PrimeFactor {

    public static List<Integer> generate(int num) {
        List<Integer> factors = new LinkedList<>();

        return factors;
    }

    public static List<Integer> getPrimes(int maxNum) {
        List<Integer> primes = new LinkedList<>();

        for (int num = 2; num <= maxNum; ++num) {
            if (!isDivisible(num, primes)) {
                primes.add(num);
            }
        }

        return primes;
    }

    private static boolean isDivisible(int num, List<Integer> primes) {
        return primes.stream().anyMatch(prime -> num % prime == 0);
    }
}
