package ANDROID;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.HashSet;

public class InteractionOfArrays {
    public static void main(String[] args) {


        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(interaction(nums1,nums2)));
    }
    static int[] interaction(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums2) {
            if (find(num, nums1)){
                set.add(num);

            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num: set) {
            result[i++]=num;
        }
        return result;
    }

    static boolean find(int target, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
