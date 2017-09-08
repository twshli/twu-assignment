package twu;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shli on 08/09/2017.
 */
public class PrimeFactorTest {

    @Test
    public void should_get_no_primes_for_1() throws Exception {
        assertThat(PrimeFactor.getPrimes(1).size(), is(0));
    }

    @Test
    public void should_get_prime_2_for_max_number_2() throws Exception {
        List<Integer> primes = PrimeFactor.getPrimes(2);

        assertThat(primes.size(), is(1));
        assertThat(primes.get(0), is(2));
    }

    @Test
    public void should_get_prime_2_and_3_for_max_number_4() throws Exception {
        List<Integer> primes = PrimeFactor.getPrimes(4);

        assertThat(primes.size(), is(2));
        assertThat(primes.get(0), is(2));
        assertThat(primes.get(1), is(3));
    }
}