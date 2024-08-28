package com.ebay.calculator;

public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public static boolean isSupported(Operation op) {
        for (Operation operation : values()) {
            if (operation == op) {
                return true;
            }
        }
        return false;
    }
}
