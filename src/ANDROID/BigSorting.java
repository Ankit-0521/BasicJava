package ANDROID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



// Consider an array of numeric strings where each string is a positive number with anywhere from  to  digits. Sort the array's elements in non-decreasing, or ascending order of their integer values and return the sorted array.
//
//Example
//
//Return the array ['1', '3', '150', '200'].
//
//Function Description
//
//Complete the bigSorting function in the editor below.
//
//bigSorting has the following parameter(s):
//
//string unsorted[n]: an unsorted array of integers as strings
public class BigSorting {
    public List<String> bigSorting(List<String> unsorted) {
// here we used lambda function
        unsorted.sort((a1, a2) -> {
            if (a1.length() < a2.length()) return -1;
            if (a1.length() > a2.length()) return 1;

            return a1.compareTo(a2);
        });
        return unsorted;

    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>((Arrays.asList("3", "54", "456", "4564676546786")));
        BigSorting bs = new BigSorting();
        System.out.println(bs.bigSorting(arr));
    }
}
