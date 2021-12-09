package testproject;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest2 {
    @Test
    public void testReset() {
        Aggregator agr = new Aggregator();
        double val = 20;
        agr.addValue(val);
        agr.reset();
        assertThat(agr.getSum()).isEqualTo(0);
    }

}
