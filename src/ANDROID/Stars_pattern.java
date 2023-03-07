package ANDROID;


import java.util.Scanner;

public class Stars_pattern {
    public static void main(String[] args) {
         /*  int nst=1; // total no. of stars in each row.
            int row=1; //counter
            int n = 5; // total no. of rows
            while (row<=n){
                int cst = 1; // to print the star
                while (cst<=nst){
                    System.out.print("* ");
                     cst++;
                }
                System.out.println();
                nst++;
                row++;
            }

          */

          /*  int nst = 5;
            int row = 1;
            int n = 5;
            while (row<=n){
                int cst = 1;
                while (cst<=nst){
                    System.out.print("* ");
                    cst++;
                }
                System.out.println();
                nst--;
                row++;

            }

            */

         /*   int nst = 5;
            int row = 1;
            int n = 5;
            int nsp = 0;
            while (row<=n){
                int csp = 1;
                while (csp<=nsp){
                    System.out.print("  ");
                    csp++;
                }
                int cst = 1;
                while (cst<=nst){
                    System.out.print("* ");
                    cst++;
                }
                System.out.println();
                 nsp++;
                 nst--;
                 row++;
            }


          */
           /* int nst = 1;
            int row = 1;
            int n = 5;
            int nsp = 4;
            while (row<=n){
                int csp = 1;
                while (csp<=nsp){
                    System.out.print("  ");
                    csp++;
                }
                int cst = 1;
                while (cst<=nst){
                    System.out.print("* ");
                    cst++;
                }
                System.out.println();
                nsp--;
                nst++;
                row++;

            }

            */
        // Diamond pattern
        Scanner sc = new Scanner(System.in);
           /* System.out.println("Enter the value of n:-) ");
            int n = sc.nextInt();
            int row = 1;
            int nst = 1;
            int nsp = n-1;
            while (row<=2*n-1){
                int csp = 1;
                while (csp<=nsp){
                    System.out.print(" ");
                    csp++;
                }

                int cst=1;
                while (cst<=nst){
                    System.out.print("* ");
                    cst++;
                }
                if (row>=n){
                    nsp++;
                    nst--;
                }
                else {
                    nsp--;
                    nst++;
                }
                System.out.println();
                row++;
            }
            */
          /*  int n = sc.nextInt();
            int row = 1;
            int nst = n;
            int nsp = 0;
            while (row <= 2 * n - 1) {
                int csp = 1;
                while (csp <= nsp) {
                    System.out.print(" ");
                    csp++;
                }
             int cst = 1;
                while (cst<=nst){
                    System.out.print("* ");
                    cst++;
                }
                if (row>=n){
                    nsp--;
                    nst++;
                }
                else {
                    nsp++;
                    nst--;
                }
                System.out.println();
                row++;
            }
           */
       /* int n = sc.nextInt();
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
      /*  int i, k;
        for (i = row-1; i >= 1; i--) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (nst = i; nst <= row-1; nst++) {
                System.out.print(nst + " ");
            }

            System.out.println();
        }

       */
        int n = sc.nextInt();
        int row = 0;
        int nst = 1;
        int nsp = n - 1;


        while (row < n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = 0;
            while (cst < nst) {
                System.out.print(ncr(row, cst) + " ");
                cst++;
            }
            System.out.println();
            row++;
            nsp--;
            nst++;
        }
    }

/*
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int k = row;
        while (row<=n){
            ;
           int d = row  -(row-1);
           int cst = (row-1) + d;
           // int cst = 1;
            while (cst<=nst){
                System.out.print(cst+ "");
                cst++;
            }
            System.out.println();
            nst++;
            row++;

        }





    }

 */

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    public static int ncr(int n, int r) {
        return fact(n) / (fact(n - r) * fact(r));
    }
}



