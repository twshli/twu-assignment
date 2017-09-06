package twu;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shli on 06/09/2017.
 */
public class TriangleTest {

    @Test
    public void should_get_one_asterisk() throws Exception {
        assertThat(Triangle.getOneAsterisk(), is("*"));
    }
}