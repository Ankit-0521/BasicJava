package ANDROID;

import java.util.Arrays;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,43,56,76,77};

        System.out.println(Ceiling(arr,33));
    }

    static int Ceiling(int[] Array, int target){
        //but what if the target is greater than the greatest number in the array.
        if (target>Array[Array.length-1]){
            return -1;
        }
        int start = 0;
        int end = Array.length-1;

        while ( start<= end){
            int mid = start +(end-start)/2;

            if(target< Array[mid]){
                end = mid - 1;
            } else if (target> Array[mid]){
                start = mid + 1;
            }
            else {
                return Array[mid];
            }

        }
        return Array[start];
    }
}
