package ANDROID;
import java.util.Arrays;

//Minimum Difference Between Largest and Smallest Value in Three Moves
//You are given an integer array nums.
//
//In one move, you can choose one element of nums and change it to any value.
//
//Return the minimum difference between the largest and smallest value of nums after performing at most three moves.
public class MinDiff {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n<4) {
            return 0;
        }
        Arrays.sort(nums);

        return Math.min(
                Math.min((nums[n-1]-nums[3]),(nums[n-2]-nums[2])),
                Math.min((nums[n-3]-nums[1]),(nums[n-4]-nums[0]))
        );
    }

    public static void main(String[] args) {
        int[] arr = {1,5,0,10,14};
        MinDiff md = new MinDiff();
        System.out.println(md.minDifference(arr));
    }
}
