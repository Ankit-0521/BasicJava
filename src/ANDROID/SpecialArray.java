package ANDROID;

import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8,0,5};
        System.out.println(specialArray(arr));
    }

     static int find(int[]nums,int x){ // to find numbers greater than or equal to x
        int count = 0;
        for(int i:nums)
        {
            if(i>=x)
                count++;
        }
        return count;
    }

    static int specialArray(int[] nums) {
        int start = 1,end = nums.length;

        while(start<=end){
            int x = start + (end-start)/2;

            if(x == find(nums,x))
                return x;

            if(find(nums,x) > x)
                start  = x+1;
            else
                end = x-1;
        }

        return -1;
    }
}