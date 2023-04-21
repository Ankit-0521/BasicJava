package ANDROID;

import java.util.Arrays;

//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//
//Return the sum of the three integers.
//
//You may assume that each input would have exactly one solution.
public class Closest3Sum {
    public int threeSumClosest(int[] nums, int target){
        int n = nums.length;
        if(n==3) return nums[0]+nums[1]+nums[2];

        Arrays.sort(nums);

        int maxSum = nums[n-1]+nums[n-2]+nums[n-3];

        if (target>maxSum) return maxSum;

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n-2; i++) {
            int left = i+1,  right = n-1;

            while (left<right){
                maxSum = nums[i]+nums[right-1]+nums[right];
                if (target-maxSum>Math.abs(minDiff)) break;

                int minSum = nums[i]+nums[left]+nums[left+1];
                if (minSum-target>Math.abs(minDiff)) break;

                int sum = nums[i]+nums[right]+nums[left];
                if (sum==target) return sum;

                int diff = sum-target;

                if (Math.abs(diff)<Math.abs(minDiff)) minDiff = diff;

                if (diff>0) right--;
                else left++;
            }
        }
        return target+minDiff;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        Closest3Sum cs = new Closest3Sum();
        System.out.println(cs.threeSumClosest(nums,1));
    }
}
