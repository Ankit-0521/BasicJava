package ANDROID;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//Given an integer array nums of unique elements, return all possible subsets
// (the power set).
//
//The solution set must not contain duplicate subsets. Return the solution in any order.
//
//
public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        int n = nums.length;
        int subsets = 1<<n;
        for(int i=0; i<subsets; i++){
            List<Integer> cl = new ArrayList<>();
            int temp = i;

            for(int j=n-1; j>=0; j--){
                int rem=temp&1;
                temp = temp>>1;

                if(rem==1){
                    cl.add(0,nums[j]);
                }
            }
            li.add(cl);
        }
        return li;
    }


    public List<List<Integer>> subsetRecursive(int[] nums){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(nums,0,new ArrayList<Integer>(), ans);
        return ans;
    }
    private void helper(int[] num, int i, ArrayList<Integer> list, List<List<Integer>> ans){
        if (i==num.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        helper(num, i+1, new ArrayList<>(list), ans);
        list.add(num[i]);
        helper(num,i+1, list, ans);
    }

    public List<List<Integer>> subsetBacktracking(int[] nums){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        subset(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
    private void subset(int[] num, int p, ArrayList<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for (int i = p; i < num.length; i++) {
            list.add(num[i]);
            subset(num,i+1,list,ans);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        SubSets ss = new SubSets();
        List<List<Integer>> ans = ss.subsets(nums);
        System.out.println(ans);
    }
}
