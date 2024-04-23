import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSentence {

    public String getReverseOf(String sentence) {
        char[] sentenceToChars = sentence.toCharArray();
        List<String> seperatedSentence = new ArrayList<>();
        StringBuilder seperatedWord = new StringBuilder();

        splitSentence(sentenceToChars, seperatedSentence, seperatedWord);
        String reversedSentence = "";
        for (int index2 = seperatedSentence.size() - 1; index2 >= 0; index2--){
            reversedSentence += (seperatedSentence.get(index2)) + " ";
        }

        return reversedSentence.stripTrailing();
    }

    private static void splitSentence(char[] sentenceToChars, List<String> seperatedSentence, StringBuilder seperatedWord) {
        for (char sentenceToChar : sentenceToChars) {
            if (sentenceToChar != ' '){
                seperatedWord.append(sentenceToChar);}
            else{ seperatedSentence.add(seperatedWord.toString());
            seperatedWord.setLength(0);}

        }
        if (seperatedWord.length() > 0) {
            seperatedSentence.add(seperatedWord.toString());
        }
    }

}



