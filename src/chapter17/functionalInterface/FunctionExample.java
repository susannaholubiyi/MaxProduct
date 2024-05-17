package chapter17.functionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = (word)->word.length();
        System.out.println(function.apply("Oluwaloseyifunminitoto"));
    }
}
