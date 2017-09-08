package twu;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Shli on 08/09/2017.
 */
public class PrimeFactor {

    public static List<Integer> generate(int num) {
        return getPrimes(num).stream()
                .filter(prime -> num % prime == 0)
                .collect(Collectors.toList());
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

    public static void main(String[] args) {
        System.out.println("Prime factors for 1: ");
        PrimeFactor.generate(1).forEach(System.out::println);

        System.out.println("Prime factors for 30: ");
        PrimeFactor.generate(30).forEach(System.out::println);
    }
}
