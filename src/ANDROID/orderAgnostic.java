package ANDROID;

import java.util.Scanner;

public class orderAgnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        //int[] arr = {-21,-12,0,12,34,56,78,98,99};
       //int[] arr = {99,98,76,54,43,22,11,9,-2,-43};
        int[] arr = new int[n];
        System.out.println("Enter the element of the Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Targeted value");
        int target = sc.nextInt();
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        // find whether the array is sorted in asc or in desc;
        boolean isAsc = arr[start]< arr[end];

        while (start<=end){
            //find the middle element;
            //  int mid = (start+end)/2;   problem : (integer has fixed sized)
            // it might be possible that (start + end) exceeds the range of int in java.
            int mid = start + (end-start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
            if(target< arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid +1;
            }
        }
            else {
                if(target> arr[mid]){
                    end = mid-1;
                }
                else if (target<arr[mid]){
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
