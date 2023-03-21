package ANDROID;
//Given an integer array nums, return the number of subarrays filled with 0.
//
//A subarray is a contiguous non-empty sequence of elements within an array.
public class NumberOfZero {

    public long zeroFilledSubarrayMine(int[] nums) {
        long ans = 0;
        int i = 0, j =0;
        while(i<nums.length){
            if( nums[i]!=0) {
                j=i+1;
            }
            ans += i-j+1;
            ++i;
        }
        return ans;
    }

    public long zeroFilledSubarray(int[] arr) {
                  int N = arr.length;
               int count = 0;
           long val = 500000500;
          long ans = 0;
           int temp = 0;
          long prev = 0;
         for(int i=0; i<N; i++)
         {
             if(arr[i]==0)
           {
                count++;
                ans = prev + ((count+1)*count/2);
             }
             else
            {
              count=0;
             prev = ans;
            }
        }
         return ans;
        }


       long method2(int[] arr){
        long val = 0 , cnt=0;
        for(int i:arr)
        {
            if(i==0)
            {
                cnt+= ++val;
            }
            else
                val = 0;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,0,0,2,0,0,4};
        NumberOfZero nm = new NumberOfZero();
        System.out.println(nm.zeroFilledSubarrayMine(arr));
        //System.out.println(nm.method2(arr));
    }
}
