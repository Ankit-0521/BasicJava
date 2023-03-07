package ANDROID;
// Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.

//The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,7};
        System.out.println(shuffle(arr));
    }
    static boolean shuffle(int[] nums){
        int count =0;
        for(int i =1; i <nums.length; i++){
            if(nums[i]<=nums[i-1]){
                if(count>1)
                    return false;
                if(i>1 && nums[i]<=nums[i-2])
                    nums[i] = nums[i-1];
                count++;
            }
        }
        return (count>1)? false:true;
    }
}
