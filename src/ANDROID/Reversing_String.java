package ANDROID;

import java.util.Arrays;

public class Reversing_String {
    public static void main(String[] args) {
        String s = new String("This is a good boy");
       char[] arr= s.toCharArray();
        //String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        int i =0; int j= arr.length-1;
        while (i<j){
           // String temp = arr[i];
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


       // for (int k = 0; k<arr.length; k++){
         //       arr[k]= new StringBuilder(arr[k]).reverse().toString();
        //}
        // for(String str : arr)
        for (char str : arr) {
            System.out.print(str+"");
        }
    }
}