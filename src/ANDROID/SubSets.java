package ANDROID;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

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
        int[] arr = {1,2,2};
        SubSets ss = new SubSets();
        SubsetDuplicate sd = new SubsetDuplicate();
        List<List<Integer>> ans = ss.subsets(nums);
        System.out.println(ans);
        System.out.println(sd.subsetsWithDup(arr));
    }
}


class SubsetDuplicate{
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        int subset = 1<<n;
        for(int i =0; i<subset; i++){
            List<Integer> li = new ArrayList<>();
            int temp = i;
            for(int j = n-1; j>=0; j--){
                int rem = temp&1;
                temp = temp>>1;
                if(rem==1){
                    li.add(0,nums[j]);
                }
            }
            ans.add(li);
        }
        List<List<Integer>> res = new ArrayList<>(ans);
        return res;
    }

    public List<List<Integer>> subsetsWithDup1(int[] nums){
        List<List<Integer>> subset = new ArrayList<>();
        Arrays.sort(nums);

        function(nums, 0 ,subset, new ArrayList<>());
        return subset;
    }

    private void function(int[] nums, int i, List<List<Integer>> subset, ArrayList<Integer> list) {
            subset.add(new ArrayList<>(list));
        for (int index = 0; index < nums.length; index++) {
            if(i>index && nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            function(nums, i+1,subset,list);
            list.remove(list.size()-1);
        }
    }
}
