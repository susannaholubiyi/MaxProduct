package chapter17.functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());

        int number = new Random().nextInt(0, 301);
        int count = 0;
        while (number!=2){
            count++;
            number = new Random().nextInt(0, 301);

        }
        System.out.println(count);
    }
}
