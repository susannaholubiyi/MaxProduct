package chapter17.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (name1, name2)-> name1.length()==name2.length();
        System.out.println(biPredicate.test("john", "sam"));
    }
}
