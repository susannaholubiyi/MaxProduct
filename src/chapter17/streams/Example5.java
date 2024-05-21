package chapter17.streams;

import java.util.stream.IntStream;

public class Example5 {
    public static void main(String[] args) {
        String word = "Hello";
        word.chars()
                .filter((number)->number > 100)
                .map((number)->number*number).forEach(System.out::println);


    }
}
