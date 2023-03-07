package ANDROID;

import java.util.Arrays;

public class DoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 6};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int bin = binarySearch(arr, arr[i] * 2);
            if (i == bin || bin == -1){
                continue;
            }
        if (arr[i] * 2 == arr[bin]){
                return true;
            }
        }
        return false;
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            //find the middle element;
            //  int mid = (start+end)/2;   problem : (integer has fixed sized)
            // it might be possible that (start + end) exceeds the range of int in java.
            int mid = start + (end-start) / 2;
            if(target< arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid +1;
            }
            else {
                // ans found.
                return mid;
            }

        }
        return -1;
    }
}
