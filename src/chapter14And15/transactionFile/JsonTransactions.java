package chapter14And15.transactionFile;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class JsonTransactions {
    public static void main(String[] args) throws IOException {
    }

    public static String convertObjectToJson(Transaction transaction){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(transaction);
            return json;
        }
        catch (IOException e){
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
    public static void addJsonObjectTo(String filePath, Transaction transaction) throws IOException {
        Path path = Paths.get(filePath);
        ObjectMapper mapper = new ObjectMapper();
        BufferedWriter writer = Files.newBufferedWriter(path);
        mapper.writeValue(writer, transaction);
        writer.close();
    }
    public static double getTotalTransactionAmount(String filePath){
        double total = 0.0;
        try{
            Path path = Paths.get(filePath);
            String files = Files.readString(path);
            Transaction[] json = deserializeTransaction(files);


            for(Transaction transaction : json){
                    total += transaction.getAmount();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return total;
    }
    public static Transaction[] deserializeTransaction(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction[].class);
    }

    public static int getNumberOfDigits(String filePath) throws  IOException{
        Path path = Paths.get(filePath);
        String fileName = Files.readString(path);
        int digits = 0;
        for (Character character: fileName.toCharArray()){
            if (character.toString().matches("\\d")){
                digits++;
            }
        }
        return digits;
    }

    public static int getNumberOfVowels(String file) throws  IOException{
        Path path = Paths.get(file);
        String sentence = Files.readString(path);
        int numberOfVowels = 0;
        for (Character character: sentence.toCharArray()){
            if (character.toString().matches("\\b[^\\saeiouAEIOU]*[aeiouAEIOU]")){
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }
}
