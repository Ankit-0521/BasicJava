package RECURSION;

import java.util.Arrays;

public class QuickySort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        quickSortt(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortt(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s+ (e-s)/2;
        int pivot = arr[m];

        while (s<=e){
            // also a reason why if its already sorted it will not swap
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index, then we will sort two halves now
        quickSortt(arr,low,e);
        quickSortt(arr,s,high);
    }
}
