package chapter17.functionalInterface;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionExample {
    public static void main(String[] args) {
        ToLongBiFunction<Integer , Integer> toLongBiFunction =
                (number1, number2)-> (long) number1 * number2;

        System.out.println(toLongBiFunction.applyAsLong(8, 3));

    }
}
