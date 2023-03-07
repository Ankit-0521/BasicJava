package ANDROID;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives.
        // syntax
        // datatype[] variable name = new datatype[size];
       // int[] ros; // declaration of array. ros is getting defined im stack.  At compile time.
       // ros = new int[5]; // initialisation : actually here object is being created in  the heap. At runtime.
       int[] arr = new int[5];
         // input using for loops
        /*for (int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
            sout(Arrays.toString(arr)) ;

        }
        // output of for loops
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        */
          for(int num : arr){// for every element in array, print the element.
              System.out.println(num + " "); // here num represents element of the array

          }
            // array of objects.
    }


}
