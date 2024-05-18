package chapter17.functionalInterface;

import java.util.function.IntFunction;

public class IntFunctionExample  {
    public static void main(String[] args) {
        IntFunction intFunction =(number)-> number * 5;
        System.out.println(intFunction.apply(7));
    }
}
