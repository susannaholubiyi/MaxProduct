package chapter17.functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction =
                (word, number)->word.length()==number;
       boolean result =  biFunction.apply("jagaban", 10);
        System.out.println(result);
    }
}
