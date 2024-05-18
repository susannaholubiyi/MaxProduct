package chapter17.functionalInterface;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionExample {
    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> toIntBiFunction = (name1,name2)-> name1 / name2;
        System.out.println(toIntBiFunction.applyAsInt(10, 2));
    }
}
