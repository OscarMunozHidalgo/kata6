import org.junit.Test;
import software.ulpgc.kata6.Calculator;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void should_return_3_when_input_1_plus_2() {
        assertThat(new Calculator("1+2").calculate()).isEqualTo("3");
    }

    @Test
    public void should_return_5_when_input_3_plus_2() {
        assertThat(new Calculator("3+2").calculate()).isEqualTo("5");
    }

    @Test
    public void should_return_30_when_input_17_plus_13() {
        assertThat(new Calculator("17+13").calculate()).isEqualTo("30");
    }

    @Test
    public void should_return_25_when_input_7_plus_3_plus_15() {
        assertThat(new Calculator("7+3+15").calculate()).isEqualTo("25");
    }

    @Test
    public void should_return_3_when_input_7_minus_4() {
        assertThat(new Calculator("7-4").calculate()).isEqualTo("3");
    }

    @Test
    public void should_return_13_when_input_7_minus_4_plus_10() {
        assertThat(new Calculator("7-4+10").calculate()).isEqualTo("13");
    }

}
