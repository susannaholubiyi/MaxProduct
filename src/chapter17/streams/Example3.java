package chapter17.streams;

import chapter14And15.transactionFile.Transaction;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 31,40, 50);
        Stream<Integer> stream  = numbers.stream();
        stream.filter((number) -> number% 2 == 0)
                .forEach((number)-> System.out.print(number+ " "));

        List<Transaction> transactions = List.of(new Transaction("100", "1234"),
                new Transaction("1000", "5678"),
                new Transaction("2000", "9012"));
        transactions.stream();
//                .filter((transaction -> new BigDecimal(transaction.getAmount())));
    }
}
