package ANDROID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.
//
//Example
//
//
//Delete the  elements  and  leaving . If both twos plus either the  or the  are deleted, it takes  deletions to leave either  or . The minimum number of deletions is .
//
//Function Description
//
//Complete the equalizeArray function in the editor below.
//
//equalizeArray has the following parameter(s):
//
//int arr[n]: an array of integers
public class EqualizeArray {
    public int equalizeArray(List<Integer> list){
        int max = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int a : list) {
            int count = mp.getOrDefault(a,0) + 1;
            mp.put(a,count);
            if(count>max){
                max = count;
            }
        }
        return list.size() - max;
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(Arrays.asList(1,2,2,3));
        EqualizeArray ea = new EqualizeArray();
        System.out.println(ea.equalizeArray(li));
    }
}
