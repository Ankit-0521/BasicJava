package ANDROID;

import java.util.Scanner;
public class DAY1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = 10, b = 15;
         System.out.println("a: " +a);
        System.out.println("b: " +b);
         a = a*b;
        b = a/b;
         a = a/b;
        System.out.println("a: " +a);
       System.out.println("b: " +b);

        // program for calculator
        /*System.out.println("Enter two Number");
        int  a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the operator");
        char ch = sc.next().charAt(0);
        if (ch=='+')
            System.out.println("sum: " +(a+b));
        else if (ch=='-')
            System.out.println("subtract: " +(a-b));
        else if (ch=='*')
            System.out.println("multiply: " +(a*b));
        else if (ch=='%')
            System.out.println("modulus: " +(a%b));
        else
            System.out.println("invalid operation");


       */

    }
}
