package chapter14And15.transactionFile;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JsonTransactionsTest {
    @Test
    public void transactionTest(){
        Transaction transaction = new Transaction();
        transaction.setName("john doe");
        transaction.setAmount(2000.00);
        transaction.setType(Type.DEBIT);
        transaction.setDate(LocalDate.parse("2024-05-01"));

        String json = JsonTransactions.convertObjectToJson(transaction);
        String expected = "{\"id\":1,\"name\":\"john doe\",\"amount\":2000.0,\"type\":\"DEBIT\",\"date\":[2024,5,1]}";
        assertEquals(expected, json);
    }
    @Test
    public void testTotalTransactionAmountTest() throws IOException {
        String filePath = "/home/user/Desktop/maxproduct/src/chapter14And15/transactionFile/transaction.json";
        Transaction transaction = new Transaction();
        transaction.setName("john doe");
        transaction.setAmount(2000.00);
        transaction.setType(Type.DEBIT);
        transaction.setDate(LocalDate.parse("2024-05-01"));

        Transaction transaction2 = new Transaction();
        transaction2.setId(transaction2.getId());
        assertEquals(2, transaction2.getId());
        transaction2.setName("jane doe");
        transaction2.setAmount(5000.00);
        transaction2.setType(Type.CREDIT);
        transaction2.setDate(LocalDate.parse("2024-05-01"));
        List<Transaction> transactions = List.of(transaction, transaction2);
        JsonTransactions.addJsonObjectTo(filePath, transactions);

        double expected = 7000.00;
        assertEquals(expected, JsonTransactions.getTotalTransactionAmount(filePath));

    }
    @Test
    public void countNumberOfDigitsInTextTest() throws IOException {
       String filepath = "/home/user/Desktop/maxproduct/src/chapter14And15/transactionFile/textFile.txt";
       int expected = 2;
       assertEquals(expected, JsonTransactions.getNumberOfDigits(filepath));
    }
    @Test
    public void countNumberOfVowelInTextTest() throws IOException {
        String filepath = "/home/user/Desktop/maxproduct/src/chapter14And15/transactionFile/textFile.txt";
        int expected = 14;
        assertEquals(expected, JsonTransactions.getNumberOfVowels(filepath));
    }
    @Test
    public void countNumberOfSentencesInTextTest() throws IOException {
        String filepath = "/home/user/Desktop/maxproduct/src/chapter14And15/transactionFile/textFile.txt";
        int expected = 3;
        assertEquals(expected, JsonTransactions.getNumberOfSentences(filepath));
    }

}