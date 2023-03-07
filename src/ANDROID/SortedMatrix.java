package ANDROID;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
            int[][] arr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
        System.out.println(Arrays.toString(BinarySearchcol(arr,6)));
    }
    static int[] SimpleBinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            }
            else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] BinarySearchcol(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length; // be cautious, matrix may be empty.
        if(rows == 1) {
            return SimpleBinarySearch(matrix,0,0,col-1,target);

        }
        int rStart = 0;
        int rEnd = rows -1;
        int cmid = col /2;
        // run the loop till the only two rows are remaining.
        while (rStart < rEnd -1);{ // while this is true it will have more than 2 rows which is going to eliminate.
            int mid = rStart + (rEnd -rStart) / 2;
            if(matrix[mid][cmid] == target){
                return new int[] {mid, cmid};
            }
            else if (matrix[mid][cmid] < target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }
        // now we have 2 rows.
        // check whether the target is in the col of 2 rows
        if(matrix[rStart][cmid]== target){
            return new int[]{rStart,cmid};
        }
        if(matrix[rStart + 1][cmid]== target) {
            return new int[]{rStart + 1, cmid};
        }
        // search in 1st half
        if(target <= matrix[rStart][cmid-1]){
            return SimpleBinarySearch(matrix,rStart,0, cmid-1,target);
        }
        // search in 2nd half
        if(target >= matrix[rStart][cmid+1]  &&  target <= matrix[rStart][col-1]){
            return SimpleBinarySearch(matrix,rStart,cmid+1,col-1,target);
        }
        // search in 3rd half
        if(target <= matrix[rStart+1][cmid-1]){
            return SimpleBinarySearch(matrix, rStart+1,0, cmid-1,target);
        }
        // search in 4th half
        else
            return SimpleBinarySearch(matrix,rStart+1,cmid+1, col-1, target);
    }
}
