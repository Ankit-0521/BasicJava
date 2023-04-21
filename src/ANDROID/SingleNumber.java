package ANDROID;
//Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ones=0;
        int twos=0;

        for (int num : nums) {
            ones = (ones ^ num) & (~twos);
            twos = (twos ^ num) & (~ones);
        }
        return ones;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,2,3,5,3,2,5};
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(arr));
    }
}
