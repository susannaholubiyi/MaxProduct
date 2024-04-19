import java.util.*;

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
        for(int index = 0; index < numbers.length; index++){
            for(int index2 = index + 1; index2 < numbers.length; index2++){
                if(numbers[index] > numbers[index2]){
                    int descending = numbers[index];
                    numbers[index] = numbers[index2];
                    numbers[index2] = descending;
                }
            }
        }
        return numbers;
    }

}
