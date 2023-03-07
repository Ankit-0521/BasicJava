package ANDROID;
import java.util.Arrays;
public class SearchInTwod {
    public static void main(String[] args) {
        int[][] arr = {
                {23,43,54},
                {23,54,65},
                {21,54,76}};
        int target = 21;
        int[] ans = search(arr, target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));


    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max = arr[row][col];

                }
            }
        }
        return max;
    }
}
