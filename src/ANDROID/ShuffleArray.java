package ANDROID;
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

import java.util.Arrays;

//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        System.out.println(Arrays.toString(shuffle(arr,4)));
    }
    static int[] shuffle(int[] nums, int n){
        int[] arr = new int[2*n];
        int i = 0; int j = 0;
        while(i<n){
            arr[i] = nums[j];
            i++;
            j++;
            arr[i] = nums[n];
            i++;
            n++;

        }
        return arr;
    }
}
