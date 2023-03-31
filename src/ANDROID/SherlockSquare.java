package ANDROID;
//Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlock must determine the number of square integers within that range.
//
//Note: A square integer is an integer which is the square of an integer, e.g.
//
//Example
//
//
//There are three square integers in the range:  and . Return .
//
//Function Description
//
//Complete the squares function in the editor below. It should return an integer representing the number of square integers in the inclusive range from  a to b .

import java.util.Scanner;

public class SherlockSquare {
    public  int squares(int a, int b) {
        int count = 0;
        int sq = (int) Math.sqrt(a);
        int p = sq*sq;
        if(p<a){
            sq++;
            p=sq*sq;
        }
        while(p>=a && p<=b){
            count++;
            sq++;
            p=sq*sq;
        }
        return count;
    }

    public static void main(String[] args) {
        SherlockSquare ss = new SherlockSquare();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println(ss.squares(a,b));
    }
}
