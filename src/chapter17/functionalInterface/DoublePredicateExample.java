package chapter17.functionalInterface;

import java.util.function.DoublePredicate;

public class DoublePredicateExample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = (digit)-> digit < 50l;
        System.out.println(doublePredicate.test(45));

        DoublePredicate doublep = (digit2)->
             digit2 * digit2 > 100;
            System.out.println(doublep.test(11));

    DoublePredicate doublePredicate3;
    doublePredicate3 = doublePredicate.and(doublep);
        System.out.println(doublePredicate3.test(30));


    }
}
