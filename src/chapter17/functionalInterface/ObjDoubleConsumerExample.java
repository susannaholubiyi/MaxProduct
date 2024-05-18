package chapter17.functionalInterface;

import java.util.List;
import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerExample {
    public static void main(String[] args) {
        ObjDoubleConsumer<List<Integer>> func = (arr, num)->{
           arr.forEach(number-> System.out.println(number + num));
        };
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        func.accept(numbers, 1.5);
    }
}
