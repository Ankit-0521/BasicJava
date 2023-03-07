package ANDROID;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findRightIntervals {
    public static void main(String[] args) {
        int[][] matrix = {{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(rightIntervals(matrix)));
    }
    static int[] rightIntervals(int[][] intervals){
        int n = intervals.length;
        int[] arr = new int[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = intervals[i][0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; ++i) {
            int val = binarySearchInterval(arr, intervals[i][1]);
            if (val == -1){
                ans[i] = -1;
            }else
                ans[i] = map.get(arr[val]);
        }
        return ans;
    }
    static int binarySearchInterval(int[] arr, int target){
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
