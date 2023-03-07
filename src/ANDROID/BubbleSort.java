package ANDROID;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] nums){
        // run the steps n-1 times
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            // for each steps, max item will come at the last respective index
            for (int j = 1; j < nums.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (nums[j] < nums[j-1]){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program.
            if (!swapped){
                break;
            }
        }

    }
}
