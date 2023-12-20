import org.junit.Test;
import software.ulpgc.kata6.*;

import static org.assertj.core.api.Assertions.assertThat;


public class FieldTest {
    @Test
    public void should_return_x_finding_mine_1x1_no_mine(){
        Field field1 = new Field(Cases.field_1x1_one_mine);
        assertThat(field1.play(0,0)).isEqualTo("x\n");
    }

    @Test
    public void should_return_0_finding_mine_1x1_mine(){
        Field field1 = new Field(Cases.field_1x1_no_mine);
        assertThat(field1.play(0,0)).isEqualTo("0\n");
    }

    public class Cases{
        public static char[][] field_1x1_no_mine = {
                {'0'}};
        public static char[][] field_1x1_one_mine = {
                {'x'}};

        public static char[][] field_2x2_one_mine = {
                {'0','x'},
                {'0','0'}};

    }
}
