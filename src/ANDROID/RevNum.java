package ANDROID;

import java.util.Scanner;

//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
public class RevNum {
    public int reverse(int x) {
        long finalSum = 0;
        while(x!=0){
            int rem = x%10;
            finalSum = finalSum*10 + rem;
            x /= 10;
        }
        if(finalSum>Integer.MAX_VALUE || finalSum<Integer.MIN_VALUE){
            return 0;
        }
        return (int) finalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int x = sc.nextInt();
        RevNum rn = new RevNum();
        int ans = rn.reverse(x);
        System.out.println(ans);
    }
}
