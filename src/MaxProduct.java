import java.util.*;

import static chapter14And15.PositionOfNumbers.getSortedInt;

public class MaxProduct {

    public int getMaximumProduct(int[] numbers) {
        if (numbers.length < 2) return 0;
       int[] sortedArray = bubbleSort(numbers);
       int productOfFirstTwo = sortedArray[0] * sortedArray[1];
       int productOfLastTwo = sortedArray[sortedArray.length - 1] * sortedArray[sortedArray.length - 2];
       if (productOfFirstTwo > productOfLastTwo) return productOfFirstTwo;
       else return productOfLastTwo;
    }
    public int[] bubbleSort(int[] numbers){
        return getSortedInt(numbers);
    }

}
