import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(10, 8, 8.8,4.4);}

    @Test
    public void canAdd() {
        assertEquals(18, calculator.getAddition());
    }

    @Test
    public void canSubtract() {
        assertEquals(2, calculator.getSubtraction());
    }

    @Test
    public void canMultiply() {
        assertEquals(80, calculator.getMultiply());
    }

    @Test public void canDivide() {
        assertEquals(2, calculator.getDivide(), 0.0);
    }

}