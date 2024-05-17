package chapter17.functionalInterface;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (firstName,lastName)-> printFullName(firstName, lastName);

        biConsumer.accept("Oluwaseyi", 12);

        Map<String, Integer> map = Map.of(
                "John", 10,
                "Doe", 15,
                "jack", 20
        );
        map.forEach(biConsumer);
    }

    private static void printFullName(String firstname, int lastName){
        System.out.println(firstname+" "+lastName);
    }
}
