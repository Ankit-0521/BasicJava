package ANDROID;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExchangeCandies {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] arr1 = {2,3};
        System.out.println(Arrays.toString(fairCandySwap(arr,arr1)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){
        int totalA = 0;
        int totalB = 0;
        for (int a : aliceSizes) {
            totalA = totalA  + a;
        }
        Set<Integer> set = new HashSet<>();
        for (int b: bobSizes) {
            totalB = totalB + b;
            set.add(b);
        }
        int delta = (totalB - totalA) / 2;
        int[] ans = new int[2];
        for (int a : aliceSizes) {
            if (set.contains(delta + a)){
                ans[0] = a;
                ans[1] = delta + a;
                break;
            }
        }
        return ans;


     /*  Arrays.sort(aliceSizes);
       Arrays.sort(bobSizes);
       int sum1 = 0;
       int sum2 = 0;
       int[] ans = new int[2];
        for (int i = 0; i < aliceSizes.length; i++) {
            sum1 += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sum2 += bobSizes[i];
        }
        int dif = (sum1 - sum2) /2;
        for (int i = 0; i < aliceSizes.length; i++) {
            int start = 0;
            int end = bobSizes.length - 1;
            while (start<= end){
                int mid = start + (end - start)/2;
                if (bobSizes[mid] == aliceSizes[i]- dif){
                    ans[0] = aliceSizes[i];
                    ans[1] = bobSizes[mid];
                    return ans;
                } else if (bobSizes[mid]<aliceSizes[i] - dif){
                    start = mid + 1;
                }else
                    end = mid -1;
            }
        }
        return ans;

      */
    }

}
