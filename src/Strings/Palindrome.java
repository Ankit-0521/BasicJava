package Strings;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "absdsba";
        System.out.println(paindromeString(str));
        int num = 123343321;
        System.out.println(palindrome1(num));
    }

    static boolean palindrome1(int num){
        int rem, sum =0;
        int temp= num;
        while (num!=0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;

        }
        if (temp==sum)
            return true;
        else
            return false;
    }

    static boolean paindromeString(String str){
        if (str == null || str.length() == 0){
            return true;
        }
        str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end){
                return false;
            }
        }
        return true;
    }
}
