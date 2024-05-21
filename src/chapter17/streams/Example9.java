package chapter17.streams;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 4, 7, 1, 2, 4, 9, 7, 3, 8, 9, 5);
        numbers.stream()
                .map((number)->String.format("number = %d", number))
                .forEach(System.out::println);
    }
}
