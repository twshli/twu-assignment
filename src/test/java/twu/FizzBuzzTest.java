package twu;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shli on 07/09/2017.
 */
public class FizzBuzzTest {

    @Test
    public void should_get_1_given_1() throws Exception {
        assertThat(FizzBuzz.getAlias(1), is("1"));
    }

    @Test
    public void should_get_Fizz_given_3() throws Exception {
        assertThat(FizzBuzz.getAlias(3), is("Fizz"));
    }
}