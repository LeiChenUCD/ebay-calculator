package com.ebay.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public Number calculate(Operation op, Number num1, Number num2) {
        switch (op) {
            case ADD:
                return num1.add(num2);
            case SUBTRACT:
                return num1.subtract(num2);
            case MULTIPLY:
                return num1.multiply(num2);
            case DIVIDE:
                return num1.divide(num2);
            default:
                throw new UnsupportedOperationException("Operation not supported: " + op);
        }
    }
}
