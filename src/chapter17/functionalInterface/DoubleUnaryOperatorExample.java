package chapter17.functionalInterface;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorExample {
    public static void main(String[] args) {
        DoubleUnaryOperator doubleUnaryOperator = (number)->number + 10;
        System.out.println(doubleUnaryOperator.applyAsDouble(5.6));
    }
}
