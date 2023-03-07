package ANDROID;

import java.util.Arrays;

public class NonDuplicateElement {
    public static void main(String[] args) {
        int[] arr = { 1,1,2,2,3,4,4,5,5};
        System.out.println(singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] nums){
        int low=0;
        int high=nums.length-2;

        while(low<=high){
            int mid=(low+high)>>1;
            if(nums[mid]==nums[mid^1]){
                low=mid+1;
            }else
                high=mid-1;
        }

        return nums[low];
    }
}
