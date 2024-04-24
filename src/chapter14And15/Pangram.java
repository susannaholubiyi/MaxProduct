package chapter14And15;

public class Pangram {
    public boolean isParagram(String sentence) {
        String regex = "(?i)(?=.*[a-z]).*";
        return sentence.matches(regex);
    }
}
