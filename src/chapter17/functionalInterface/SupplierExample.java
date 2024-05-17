package chapter17.functionalInterface;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 5;
        System.out.println(supplier.get());

        int number = new Random().nextInt(0, 301);
        int count = 0;
        while (number!=2){
            count++;
            number = new Random().nextInt(0, 301);

        }
        System.out.println(count);
//        Stream.generate(supplier).forEach(x-> System.out.println(x));
    }
}
