package com.ebay.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Number {

    private float underlineNum;

    Number(Float num) {
        underlineNum = num;
    }

    public float getUnderlineNum() {
        return underlineNum;
    }

    public Number add(Number num) {
        return new Number(underlineNum + num.getUnderlineNum());
    }

    public Number subtract(Number num) {
        return new Number(underlineNum - num.getUnderlineNum());
    }

    public Number multiply(Number num) {
        return new Number(underlineNum * num.getUnderlineNum());
    }

    public Number divide(Number num) {
        if (num.getUnderlineNum() == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return new Number(underlineNum / num.getUnderlineNum());
    }

    // Chain method that accepts an operation and another Number
    public Number chain(Operation op, Number num) {
        switch (op) {
            case ADD:
                return this.add(num);
            case SUBTRACT:
                return this.subtract(num);
            case MULTIPLY:
                return this.multiply(num);
            case DIVIDE:
                return this.divide(num);
            default:
                throw new UnsupportedOperationException("Operation not supported: " + op);
        }
    }
}
