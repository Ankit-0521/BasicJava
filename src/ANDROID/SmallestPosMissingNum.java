package ANDROID;
//Given an unsorted integer array nums, return the smallest missing positive integer.

//You must implement an algorithm that runs in O(n) time and uses constant extra space.
public class SmallestPosMissingNum {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,4};
        System.out.println(MissingPositiveNum(arr));
    }
    static int MissingPositiveNum(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] -1;
            if (arr[i]> 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return index+1;
            }
        }
        // case 2
        return arr.length+1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
