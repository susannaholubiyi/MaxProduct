package chapter17.functionalInterface;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorExample {
    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = (number)-> number *10;
        System.out.println(intUnaryOperator.applyAsInt(6));
    }
}
