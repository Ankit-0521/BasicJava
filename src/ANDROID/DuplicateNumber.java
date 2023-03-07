package ANDROID;


public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.println(Duplicate(arr));
    }
    static boolean Duplicate(int[] nums){
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return true;
                }
            } else {
                i++;
            }
        }
        return false;
    }
     static void swap(int[] arr, int first, int second) {
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
     }
}

