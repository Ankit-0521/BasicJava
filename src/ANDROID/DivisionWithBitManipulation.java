package ANDROID;

import java.util.Scanner;

//Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
//
//The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be
// truncated to 8, and -2.7335 would be truncated to -2.
//
//Return the quotient after dividing dividend by divisor.
//
//Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
// [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the
// quotient is strictly less than -231, then return -231.
public class DivisionWithBitManipulation {
    public int divide(int dividend, int divisor) {
        //to check whether the num is pos or neg.
        boolean isNeg = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        // converting divisor and dividend into long to avoid overflow.
        long absD = Math.abs((long) dividend);
        long absd = Math.abs((long) divisor);
        long quot = 0;
        while(absD>=absd){
            long temp = absd, count = 1;
            while(temp<=absD){
                temp <<= 1;
                count <<= 1;
            }
            quot  += count>>1;
            absD -= temp>>1;
        }
        return isNeg ? (int)~quot +1 : quot > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) quot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int D = sc.nextInt();
        System.out.println("Enter the divisor");
        int d = sc.nextInt();
        DivisionWithBitManipulation dd = new DivisionWithBitManipulation();
        System.out.println(dd.divide(D,d));
    }
}
