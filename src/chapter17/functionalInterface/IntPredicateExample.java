package chapter17.functionalInterface;

import java.util.function.IntPredicate;

public class IntPredicateExample {
    public static void main(String[] args) {
        IntPredicate intPredicate = (number)-> number==5;
        System.out.println(intPredicate.test(5));
    }
}
