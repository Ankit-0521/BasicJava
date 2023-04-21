package ANDROID;
//Reverse bits of a given 32 bits unsigned integer.
//
//Note:
//
//Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will
// be given as a signed integer type. They should not affect your implementation, as the integer's internal binary
// representation is the same, whether it is signed or unsigned.
//In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above,
// the input represents the signed integer -3 and the output represents the signed integer -1073741825.

import java.util.Scanner;

public class ReverseBits {
    public int reverseBit(int n){
        if (n == 0) {
            return 0;
        }

        int result = 0;
        int power = 31;

        while (n != 0) {
            result |= (n & 1) << power;
            n >>>= 1;
            power--;
        }

        return result;
    }

    public int reverseBits(int n) {
        int binaryNum = 0;

        for(int i=0;i<32;i++) {
            binaryNum = binaryNum<<1;
            binaryNum = binaryNum + (n&1);
            n=n>>1;
        }
        return binaryNum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = Integer.parseInt(sc.nextLine());
        ReverseBits rb = new ReverseBits();
        System.out.println(rb.reverseBit(n));
    }
}
