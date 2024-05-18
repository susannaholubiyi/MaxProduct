package chapter17.functionalInterface;

import java.util.Random;
import java.util.function.IntConsumer;

public class IntConsumerExample {
    public static void main(String[] args) {
        IntConsumer intConsumer = (number)->
            System.out.println(number -2);

        intConsumer.accept(new Random().nextInt(0,10));
    }
}
