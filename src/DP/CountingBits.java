package DP;

import java.util.Arrays;

//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i<ans.length; i++){
            ans[i] = ones(i);
        }
        return ans;
    }

    public int ones(int n){
        int count = 0;
        while(n!=0){
            count += (n&1);
            n = n>>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        CountingBits m = new CountingBits();
        int[] ans = m.countBits(4);
        System.out.println(Arrays.toString(ans));
    }
}
