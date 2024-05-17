package chapter17.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = (x)->x.contains("a");
        System.out.println(predicate.test("jonah"));

    }
}
