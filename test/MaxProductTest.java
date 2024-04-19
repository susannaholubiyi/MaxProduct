import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProductTest {
    @Test
    public void functionReturnsMaximumProductTest(){
        MaxProduct maxProduct = new MaxProduct();
        int[] numbers = {1,3,5};
       assertEquals(15, maxProduct.getMaximumProduct(numbers));
    }

}