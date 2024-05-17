package chapter17.functionalInterface;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionExample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (decimal) -> (int) (decimal * 5);
        System.out.println(doubleToIntFunction.applyAsInt(6.4));
    }
}
