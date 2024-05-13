package chapter14And15.transactionFile;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

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
        String filePath = "/home/user/Desktop/maxproduct/src/chapter14And15/transactionFile/transactions.json";
        Transaction transaction = new Transaction();
        transaction.setName("john doe");
        transaction.setAmount(2000.00);
        transaction.setType(Type.DEBIT);
        transaction.setDate(LocalDate.parse("2024-05-01"));
        JsonTransactions.addJsonObjectTo(filePath, transaction);

        Transaction transaction2 = new Transaction();
        transaction2.setId(transaction2.getId());
        assertEquals(2, transaction2.getId());
        transaction2.setName("jane doe");
        transaction2.setAmount(5000.00);
        transaction2.setType(Type.CREDIT);
        transaction2.setDate(LocalDate.parse("2024-05-01"));
        JsonTransactions.addJsonObjectTo(filePath, transaction2);

        double expected = 3000.00;
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
        int expected = 5;
        assertEquals(expected, JsonTransactions.getNumberOfVowels(filepath));
    }

}