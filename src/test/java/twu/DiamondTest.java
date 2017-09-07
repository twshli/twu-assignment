package twu;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shli on 06/09/2017.
 */
public class DiamondTest {

    @Test
    public void should_get_1_asterisk_while_draw_triangle_with_1_layer() throws Exception {
        assertThat(Diamond.getTriangle(1), is("*"));
    }
}