package RECURSION;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
//https://ide.geeksforgeeks.org/5e633945-5dd2-433a-bd43-fb4b2e992a40
//Given an array of integers, print a sum triangle from it such that the first level has all array elements.
// From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level.
public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        TriangleArray(arr);

    }
     static void TriangleArray(int[] arr){
        if (arr.length < 1){
            return;
        }
        int[] temp = new int[arr.length-1];
        helper(temp, arr, 0);
       TriangleArray(temp);

         System.out.println(Arrays.toString(arr));
     }
     static int[] helper(int[] temp, int[] arr, int index){
        if (index==arr.length-1){
            return temp;
        }
        temp[index] = arr[index] + arr[index+1];
        return helper(temp,arr,index+1);
     }



}
