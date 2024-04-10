import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.add(3,2));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        float result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        float result = calculator.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        float result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }
}