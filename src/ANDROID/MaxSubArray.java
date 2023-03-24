package ANDROID;
// Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class MaxSubArray {
    int maxSubArray(int[] nums){ // kadane's theorem
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum,max);
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubArray mm = new MaxSubArray();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(mm.maxSubDP(arr));
    }

    int maxSubDP(int[] nums){
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum+nums[i],nums[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
}
