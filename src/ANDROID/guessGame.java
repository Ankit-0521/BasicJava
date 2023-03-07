package ANDROID;

import java.util.Arrays;

public class guessGame {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(twoSum(arr,7)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target)
                return new int[]{i + 1, j + 1};
            if (sum > target)
                j--;
            else
                i++;
        }
        return new int[]{};
    }
}