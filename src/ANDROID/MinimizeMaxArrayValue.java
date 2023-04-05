package ANDROID;
//You are given a 0-indexed array nums comprising of n non-negative integers.
//
//In one operation, you must:
//
//Choose an integer i such that 1 <= i < n and nums[i] > 0.
//Decrease nums[i] by 1.
//Increase nums[i - 1] by 1.
//Return the minimum possible value of the maximum integer of nums after performing any number of operations.
public class MinimizeMaxArrayValue {
    public int minimizeMaxValue(int[] nums){
        long minmax = 0;
        long numsum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsum += nums[i];
            minmax = Math.max(minmax, (numsum+i)/(i+1));
        }
        return (int) minmax;
    }

    public static void main(String[] args) {
        int[] arr = {3,7,1,6};
        MinimizeMaxArrayValue mn = new MinimizeMaxArrayValue();
        System.out.println(mn.minimizeMaxValue(arr));
    }
}
