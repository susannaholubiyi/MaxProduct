package chapter17.streams;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<String> words = List.of("qwerty", "asdfg", "abcdefg", "abc");
        words.stream()
                .map((word)->word.length())
                .forEach(System.out::println);
    }
}
