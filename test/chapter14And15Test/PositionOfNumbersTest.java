package chapter14And15Test;

import chapter14And15.PositionOfNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionOfNumbersTest {
    @Test
    public void functionReturnsPositionOfNumbersTest(){
        PositionOfNumbers positionOfNumbers = new PositionOfNumbers();
        int[] numbers = {10, 2, 8};
        int[] position = {3, 1, 2};
        assertArrayEquals(position, positionOfNumbers.getPosition(numbers));
    }

}