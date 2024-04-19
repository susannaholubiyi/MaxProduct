import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RearrangeZerosTest {
    @Test
    public void functionTakesAnArray_returnsRearrangedArrayWithZerosAtTheEndTest(){
        RearrangeZeros rearrangeZeros = new RearrangeZeros();
        int[] numbers = {3, 2, 0, -1, 7, 0, 8};
        //int[] expected = {3, 2 -1, 7, 8, 0, 0};
        assertArrayEquals(new int[]{3, 2, -1, 7, 8, 0, 0}, rearrangeZeros.getRearrangedArray(numbers));
    }
}
