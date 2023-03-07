package ANDROID;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n;
        int nsp = 0;
        int k = row;
        while (row < 2*n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = k;
            while (cst <= nst) {
                System.out.print(cst + " ");
                cst++;
            }
            if (row>=n){

                nsp--;
                k--;
            }
            else {
                k++;
                nsp++;
            }
            System.out.println();
            row++;

        }
    }
}
