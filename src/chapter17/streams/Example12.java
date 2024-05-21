package chapter17.streams;

import java.util.List;
import java.util.stream.IntStream;

public class Example12 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        var stats =numbers.stream()
                .flatMapToInt((element)-> IntStream.of( element * 2))
                .summaryStatistics();
        System.out.println(stats);
        stats.accept(10);
        System.out.println(stats);
    }
}
