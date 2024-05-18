package chapter17.functionalInterface;

import java.util.List;
import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer =
                (number)-> System.out.println("You entered "+number);

        doubleConsumer.accept(7.8);

    }


}
