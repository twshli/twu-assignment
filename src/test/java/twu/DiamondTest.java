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

    @Test
    public void should_get_asterisk_triangle_with_3_layers() throws Exception {
        String triangle =
                "  *\n" +
                " ***\n" +
                "*****";

        assertThat(Diamond.getTriangle(3), is(triangle));
    }

    @Test
    public void should_get_1_asterisk_while_draw_diamond_with_1_layer() throws Exception {
        assertThat(Diamond.getDiamond(1), is("*"));
    }

    @Test
    public void should_get_asterisk_diamond_with_3_layers() throws Exception {
        String diamond =
                "  *\n" +
                " ***\n" +
                "*****\n" +
                " ***\n" +
                "  *";

        assertThat(Diamond.getDiamond(3), is(diamond));
    }

    @Test
    public void should_get_name_while_draw_name_diamond_with_1_layer() throws Exception {
        assertThat(Diamond.getNameDiamond(1, "Bill"), is("Bill"));
    }

    @Test
    public void should_get_name_diamond_with_3_layers() throws Exception {
        String nameDiamond =
                "  *\n" +
                " ***\n" +
                "Bill\n" +
                " ***\n" +
                "  *";

        assertThat(Diamond.getNameDiamond(3, "Bill"), is(nameDiamond));
    }
}