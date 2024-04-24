package chapter14And15;

import java.util.Arrays;

public class PositionOfNumbers {
    public int[] getPosition(int[] numbers) {
        int[] temp = Arrays.copyOf(numbers,numbers.length);
        int[] output = new int[numbers.length];
        int[] sortedNumbers = getSortedInt(numbers);

        for (int index = sortedNumbers.length-1; index >=0; index--){
            for (int index2 = 0; index2 <sortedNumbers.length ; index2++){
                if (temp[index]== sortedNumbers[index2])
                {output[index] = (index2 + 1);}
            }
        }
        return output;

    }


    public static int[] getSortedInt(int[] numbers) {
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
