package chapter14And15.transactionFile;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;
import java.util.Comparator;

public class Transaction {
    public Transaction() {

    }
    public Transaction(String amount, String accountNumber) {
        this.amount = Double.parseDouble(amount);
        this.accountNumber = accountNumber;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String accountNumber;
    public int getId() {
        return id + 1;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private Type type;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate date;

    @Override
    public String toString() {
        return "{id: " + id + " , name: " + name + ", amount: " + amount + ", type: " + type + ", date: " + date + "}";
    }
}