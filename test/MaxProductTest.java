import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProductTest {
    @Test
    public void functionReturnsMaximumProductTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] numbers = {3, 5, 0, -4, 1, -2, -10};
       assertEquals(40, maxProduct.getMaximumProduct(numbers));
    }
    @Test
    public void functionReturnsProductOfTwoNumbersTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] numbers = {3, 5};
        assertEquals(15, maxProduct.getMaximumProduct(numbers));
    }
    @Test
    public void functionReturnsZeroWhenArrayLengthIsOneTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] numbers = {3};
        assertEquals(0, maxProduct.getMaximumProduct(numbers));
    }
    @Test
    public void functionReturnsSortedArrayTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] numbers = {3, 5, 0, -4, 1, -2, -10};
        assertArrayEquals(new int[]{-10, -4, -2, 0, 1, 3, 5}, maxProduct.bubbleSort(numbers));
    }


}