package ANDROID;


import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String str2 = sc.nextLine();
        boolean status = true;
        if (str1.length()!= str2.length())
            status = false;
        else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            status = Arrays.equals(arr1,arr2);
        }
        if (status)
            System.out.println(str1+ " and " +str2+ " is Anagram");
        else
            System.out.println("they are different");

    }
}