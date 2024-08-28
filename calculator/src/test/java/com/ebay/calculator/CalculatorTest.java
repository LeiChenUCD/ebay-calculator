package com.ebay.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void testCalculate() {
        Calculator calculator = new Calculator();
        Number num1 = new Number(10f);
        Number num2 = new Number(5f);

        assertEquals(15f, calculator.calculate(Operation.ADD, num1, num2).getUnderlineNum());
        assertEquals(5f, calculator.calculate(Operation.SUBTRACT, num1, num2).getUnderlineNum());
        assertEquals(50f, calculator.calculate(Operation.MULTIPLY, num1, num2).getUnderlineNum());
        assertEquals(2f, calculator.calculate(Operation.DIVIDE, num1, num2).getUnderlineNum());
        assertThrows(ArithmeticException.class, () -> calculator.calculate(Operation.DIVIDE, num1, new Number(0f)));
    }

    @Test
    void testCalculateChain() {
        Number num1 = new Number(5f);

        assertEquals(16f, num1
                .chain(Operation.ADD, new Number(3f))
                .chain(Operation.MULTIPLY, new Number(2f))
                .getUnderlineNum()
        );
    }
}
