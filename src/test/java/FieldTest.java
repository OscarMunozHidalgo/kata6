import org.junit.Test;
import software.ulpgc.kata6.*;

import static org.assertj.core.api.Assertions.assertThat;


public class FieldTest {
    @Test
    public void should_return_no_mine_in_a_1x1_no_mine(){
        assertThat(new Field(Cases.no_mine_1x1).play(0,0)).isEqualTo("0\n");
    }
    @Test
    public void should_return_mine_in_a_1x1_mine(){
        assertThat(new Field(Cases.one_mine_1x1).play(0,0)).isEqualTo("x\n");
    }
    @Test
    public void should_return_Illegal_move_in_a_1x1_mine_when_placed_out_of_bounds(){
        assertThat(new Field(Cases.one_mine_1x1).play(1,0)).isEqualTo("Illegal Move\n");
    }
    @Test
    public void should_return_correct_resolution_of_2x2_step_by_step(){
        Field field1 = new Field(Cases.one_mine_2x2);
        assertThat(field1.play(0,0)).isEqualTo("0.\n..\n");
        assertThat(field1.play(1,0)).isEqualTo("00\n..\n");
        assertThat(field1.play(0,1)).isEqualTo("00\nx.\n");
        assertThat(field1.play(1,1)).isEqualTo("00\nx0\n");
    }

    public static class Cases{
        public static final char[][] no_mine_1x1= {
                {'.'}
        };

        public static final char[][] one_mine_1x1= {
                {'x'}
        };
        public static final char[][] no_mine_2x2= {
                {'n','n'},
                {'n','n'},
        };
        public static final char[][] one_mine_2x2= {
                {'n','n'},
                {'x','n'},
        };
    }
}
