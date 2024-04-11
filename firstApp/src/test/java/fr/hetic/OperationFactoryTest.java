package fr.hetic;

import org.junit.jupiter.api.Test;
import java.util.function.BinaryOperator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import fr.hetic.OperationFactory;

public class OperationFactoryTest {
    @Test
    public void testAddition() {
        Operation operation = OperationFactory.getOperation("+");
        double result = operation.execute(2, 3);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        Operation operation = OperationFactory.getOperation("-");
        double result = operation.execute(3, 1);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        Operation operation = OperationFactory.getOperation("x");
        double result = operation.execute(3, 2);
        assertEquals(6.0, result, 0.0001);
    }
}