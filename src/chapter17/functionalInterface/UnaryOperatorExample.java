package chapter17.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (something)->something*2;
        System.out.println(unaryOperator.apply(3));
    }
}
