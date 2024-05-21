package chapter17.streams;

import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 4, 7, 1, 2, 4, 9, 7, 3, 8, 9, 5, 6);
        List<Integer> result = numbers.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(result);
    }
}
