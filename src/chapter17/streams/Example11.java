package chapter17.streams;

import java.util.List;
import java.util.stream.Stream;

public class Example11 {
    public static void main(String[] args) {
        List<String> list = List.of("abcd", "hello", "hey");
        System.out.println(list.stream()
                .flatMap((element) -> Stream.of(new StringBuilder(element).reverse()))
                .toList());
    }
}
