package chapter17.streams;

import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
//        for (int number= 1; number< 11; number++){
//            if (number %2 == 0) System.out.println(number);
//        }
        System.out.println(IntStream.rangeClosed(1, 10)
                .filter((number) -> number % 2 == 0)
                .sum());
    }
}
