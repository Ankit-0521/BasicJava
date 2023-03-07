package RECURSION;

import java.lang.reflect.Array;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class FindElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,4,5,6};
        // System.out.println(find1index(arr,4,0));
        // System.out.println(find(arr,4,0));
        // System.out.println(find1indexAll(arr,4,0,new ArrayList<>()));

        //  System.out.println(find1indexLast(arr,4,arr.length-1));
        System.out.println(find1indexall2(arr,4,0));
    }
    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }

    static int find1index(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return find1index(arr, target, index + 1);
        }
    }
    static int find1indexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return find1indexLast(arr, target, index - 1);
        }
    }

    static ArrayList find1indexAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
             list.add(index);
        }
        return find1indexAll(arr, target, index + 1, list);
    }

    static ArrayList<Integer> find1indexall2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        //this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
           ArrayList<Integer> ansFromBelowCalls = find1indexall2(arr, target, index + 1);
            list.addAll(ansFromBelowCalls);
            return list;
    }
}
