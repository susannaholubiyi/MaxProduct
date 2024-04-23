import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSentenceTest {
    @Test
    public void functionCanReverseSentenceTest(){
        ReverseSentence reverseSentence = new ReverseSentence();
        String sentence = "It is still a beautiful world";
        String output = "world beautiful a still is It";
        assertEquals(output, reverseSentence.getReverseOf(sentence));
    }

}