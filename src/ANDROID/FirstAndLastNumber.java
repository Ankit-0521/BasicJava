package ANDROID;

import java.util.Arrays;

public class FirstAndLastNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,8,9,23};
        System.out.println(Arrays.toString(searchRange(arr,5)));
    }
    static int[] searchRange(int[] nums, int target){

           int[] ans = {-1, -1};

           // check for the first occurence if target first
            int start = search(nums,target,true);
            int end =  search(nums,target,false);
            ans[0] = start;
            ans[1] = end;
            return ans;

        }
       static int search(int[] nums, int target, boolean findStartIndex){
        int ans =-1;
        int start = 0;
            int end = nums.length-1;

            while ( start<= end){
                int mid = start +(end-start)/2;

                if(target< nums[mid]){
                    end = mid - 1;
                } else if (target> nums[mid]){
                    start = mid + 1;
                }
                else {
                    // potential ans is found
                    ans = mid;
                    if(findStartIndex){ // It may be possible that there can be more potential ans on left side of ans which we got
                        end = mid -1;
                    }
                    else { // It may be possible that there can be more potential ans on the right side of ans which we gotN
                        start = mid + 1;
                    }
                }

            }
            return ans;
        }

    }


