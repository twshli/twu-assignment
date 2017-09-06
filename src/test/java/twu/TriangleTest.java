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

    @Test
    public void should_get_8_asterisks_while_draw_horizontal_line_with_length_8() throws Exception {
        assertThat(Triangle.getHorizontalAsteriskLine(8), is("********"));
    }
}