package ANDROID;

import java.util.Scanner;

public class SumOfPrime {
     static int check_sum(int num){
         int flag =0;
         for (int i = 2; i < i/2; i++) {
             if (num%i==0){
                 flag = 1;
                 return 1;
             }

         }
         if (flag ==0)
             return 0;
         return 1;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        find(num);
    }
    static void find(int num){
        for (int i = 2; i < num/2; i++) {
            if (check_sum(i)==0){
                if (check_sum(num-1) ==0)
                    System.out.println(num + " = "+ (num-i) + " "+ i);
            }
        }
    }
}
