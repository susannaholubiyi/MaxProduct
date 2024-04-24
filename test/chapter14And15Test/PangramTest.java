package chapter14And15Test;

import chapter14And15.Pangram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PangramTest {
    @Test
    public void functionChecksIfSentenceIsAPangramTest(){
        Pangram pangram = new Pangram();
        String sentence = "the quick brown fox jumps over the lazy dog";
        assertTrue(pangram.isParagram(sentence));
    }
}
