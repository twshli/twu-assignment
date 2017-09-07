package twu;

import org.junit.Test;

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
}