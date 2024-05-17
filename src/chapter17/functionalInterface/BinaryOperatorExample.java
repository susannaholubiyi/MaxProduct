package chapter17.functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Double> binaryOperator = (num1, num2)->num1 *num2;
        System.out.println(binaryOperator.apply(5.0, 3.0));
    }
}
