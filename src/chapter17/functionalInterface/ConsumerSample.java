package chapter17.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s)->{
            //the for each method calls the functional method accept in consumer .
            // in this code the for each is picking each element from the list and saying the consumer should accept each element in the code a
            System.out.println("You have entered "+s);
            System.out.println("I am printing "+s);
        };
        List<String> names = List.of("John", "Joe", "Johnny");
        names.forEach(consumer);
    }
}
