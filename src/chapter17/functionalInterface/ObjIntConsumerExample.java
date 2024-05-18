package chapter17.functionalInterface;

import java.util.List;
import java.util.function.ObjIntConsumer;

public class ObjIntConsumerExample {
    public static void main(String[] args) {
        ObjIntConsumer<List<Integer>> objIntConsumer = (arr, num)->{
                arr.forEach(a->System.out.println(a * num));
        };
        List<Integer> numbers = List.of(4, 3, 2 ,6, 7);
        objIntConsumer.accept(numbers,2);

    }
}
