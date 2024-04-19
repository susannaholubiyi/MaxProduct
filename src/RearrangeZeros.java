import java.util.Arrays;

public class RearrangeZeros {
    public int[] getRearrangedArray(int[] numbers) {
       int[] newArray = new int[numbers.length];
       int count = 0;
        for (int number : numbers) {
            if (number != 0){
                newArray[count++] = number;

            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
