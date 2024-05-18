package chapter17.streams;

import chapter14And15.transactionFile.Transaction;

import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(4, 2, 3 ,1, 5);
        Stream<Integer> stream = numbers.stream();
        stream.forEach((number)-> System.out.println(number));

        Stream<String > emptyStream = Stream.empty();

        Stream<Transaction> transactionStream =
                Stream.of(new Transaction("100", "1234"),
                        new Transaction("200","5678"));
        transactionStream.forEach(
                (transaction -> System.out.printf("Account with account number %s has $%s in it.\n",transaction.getAccountNumber(),
                        transaction.getAmount())));

        Stream<Integer> integerStream = Stream.generate(()->new Random().nextInt(0,6)).limit(5);
        integerStream.forEach(System.out::println);
        //method reference is used when the element in the foreach is the same as the one it is collecting

    }
}
