package ANDROID;


import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day2
{
    public static void main(String[] args) {
        // FizzBuzz Another way
        Scanner sc = new Scanner(System.in);
      /*
        System.out.println(res);
        return;

       */
        // switch case

       /* System.out.println("Enter the first");
       int n = sc.nextInt();
        String res = "";
        if (n % 3 == 0){
            res = res + " Fizz";
        }
        if (n % 5 == 0){
            res = res + " Buzz";
        }
        //st number");
         int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the Operator");
        char ch = sc.next().charAt(0);
        System.out.println("Result:");
        switch (ch) {
            case '+': {
                System.out.println(a + b);
                break;
            }
            case '-': {
                System.out.println(a - b);
                break;
            }
            case '*': {
                System.out.println(a * b);
                break;
            }
            case '/': {
                System.out.println(a / b);
                break;
            }
            case '%': {
                System.out.println(a % b);
                break;
            }
            default: {
                System.out.println("Invalid operation");
            }
        }*/
        // FIbanocci number
      /*  System.out.println("Enter the number");
        int num = sc.nextInt();
        int a = 0, b = 1, fib;
        System.out.println(a);
        System.out.println(b);
        for(int i = 2; i<=num; i++)
        {
            fib = a + b;
            a = b;
            b = fib;
            System.out.println(fib);
        }

       */
        // TABLE
       /* System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i  = 10; i >=1; i--)
        System.out.println(num + " * " + i + " = " + num*i);

        */
        // Prime Number
      /*  int i, m = 0, flag = 0;
        int n = sc.nextInt();
        m = n / 2;
        if (n <= 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i < m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }



       */


        // Prime Number
        /*int a,  i=2;
        System.out.println("Enter a number to check if its prime");
        a = sc.nextInt();
        boolean flag = false;
        while (i<=a /2)
        {
            if (a % i == 0)
            {
                flag = true;
                break;
            }

            i++;
        }

        if (!flag)
            System.out.println("The number is Prime");
        else
            System.out.println("The number is not Prime");

         */


        // Reverse Numbers
       /* System.out.println("Enter the number to check if it is palindrome or not:");
      int num = sc.nextInt();
        int rem, sum =0;
        int temp=num;
        while (num!=0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;

        }
        if (temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");


        */



      /*  System.out.println("Enter the number to check whether it is Prime or not?");
        int n = sc.nextInt();
        prime(n);

       */
        // combination formulae
    /*   public static void prime(int n){
        int flag = 0;
        for (int i = 2; i <n; i++)
        {
            if (n % i == 0){
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }


     */
        // combination formulae
     /*   System.out.println("Enter the values");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int ans = (fact(n) / (fact(n-r) * fact(r)));
        System.out.println(ans);
    }
    public static int fact(int n)
    {
        int f = 1;
         for (int i = 1; i<=n; i++)
             f *=i;
         return f;

      */

        // n/2 case
      /*  int n = sc.nextInt();
        boolean flag = false;


        for (int i = 2; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if ( flag == false) {
             System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }

       */


        // n case
       /* int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");


        */



      /*  int i;
        int[] arr = {50, 43, 56, 42, 554, 231, 123, 67, 89, 98};
        quickSort(arr, 0, 9);
        System.out.println("The sorted Array is:");
        for (i=0; i<10; i++)
            System.out.println(arr[i]);
    }

    public static int partition(int a[], int beg, int end)
    {
        int left, right, temp, loc, flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while(flag!=1)
        {
            while((a[loc]<=a[right])&&(loc!=right))
                right--;
            if(loc==right)
                flag = 1;
            else if(a[loc]>a[right])
            {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if(flag!=1)
            {
                while((a[loc]>=a[left])&&(loc!=left))
                    left++;
                if(loc==left)
                flag = 1;
                else if(a[loc]<a[left])
                {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }
     static void quickSort(int a[], int beg,int end)
     {
         int loc;
         if(beg<end)
         {
             loc = partition(a, beg, end);
             quickSort(a, beg, loc-1);
             quickSort(a, loc+1, end);
         }
     }

       */
        // square roots

     /*   System.out.println("Enter the number: ");
        double num=sc.nextDouble();
        double result= sqrt(num);
        System.out.println(result);
    }

    public static double sqrt(double n)
    {
        double temp;
        double root =n/2;
        do
            {
                temp = root;
                root = (temp + (n / temp)) / 2;

            }
            while((temp-root)!=0);
            return root;


      */
        // sqrt of a number up fixed decimal points.
        /* System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of Decimal places: ");
        int p = sc.nextInt();
        double res = 0.0;
        for (int i=0; i*i<=n; i++)
        {
            res = i;
        }
        System.out.println(res);
        double inc = 0.1;
        for (int i=0;i<p; i++) {
            while (res * res <= n) {
                res += inc;
            }
            res -= inc;
            inc = inc / 10;
        }
        System.out.println((float)res);

         */

        // Armstrong number
      /*  System.out.println(isArm());
    }
     public static boolean isArm()
     {
         System.out.println("Enter the Number");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int c=n,r = 0;
         while (c>0)
         {
             int d=c%10;
            c/=10;
             r = r + (d*d*d);

         }
         if (r==n)
             return true;
         else

         return false;
       */
        //  find max value
    /*int[] arr = new int[5];
    int max = Integer.MIN_VALUE;
    for (int i = 0; i< arr.length; i++)
    {
     arr[i] = sc.nextInt();
     // if (arr[i] > max)
      //   max = arr[i];
        max = arr[i] > max ? arr[i] : max;   // terniary operator
    }
        System.out.println(max);

     */
        // to find min value.
      /* int[] arr = new int[5];
       int min = Integer.MAX_VALUE;
       for (int i = 0; i<arr.length; i++)
       {
           arr[i] = sc.nextInt();
           min = arr[i] < min ? arr[i]:min; //terniary operator
       }
        System.out.println(min);
       */
        // This program is not suitable because variable [i] is not used.
        // second way of declaration and reversing the array.
        /*int[] arr = {10,20, 30,40,50};
        int k =0;
        int temp, i=0;
        int l = arr.length - 1;
        for ( i=0; i<arr.length/2; i++)
        {
            temp = arr[k];
            arr[k]=arr[l];
            arr[l]=temp;
            k++;
            l--;

        }
        System.out.println(arr[i]);
        for ( i =0; i<arr.length; i++)
          System.out.println(arr[i]);
         */

        // Better way to reverse the array.
      /* int[] arr = {10,20,30,40,50,60,70};
         int[] a = new int[arr.length];
         for (int i=arr.length-1, j=0;  i>=0&& j<a.length; i--, j++)
         {
             a[j]=arr[i];
         }
         for (int i=0; i<a.length; i++)
        System.out.println(a[i]);
       */
        //
        // Reversing another way
       /*  int[] arr={10,20,30,40,50,60};
         int j=0;
         int k = arr.length - 1;
         while(j < k)
         {
             int temp = arr[j];
             arr[j] = arr[k];
             arr[k]=temp;
             j++;
             k--;
         }
         for (int i=0; i<arr.length; i++)
                System.out.println(arr[i]);

        */

        /*int[] arr = {10, 40, 32, 20, 45, 43};
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
         */
       /* ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);
        System.out.println(list);
        list.set(2,34);
        System.out.println(list);
        list.add(5,60);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(30));
        System.out.println(list.indexOf(40));
        System.out.println(list.lastIndexOf(20));
        //int[] arr = {1,22,11,32,23,31};
        //for (int i : arr)

        */
          //  System.out.println(i);
       // Arrays.sort(arr);
        //for (int j=0; j<arr.length-1;j++)
          //  System.out.println(arr[j]);
       // for (int i=0; i<list.size(); i++)
         //   System.out.println(list.get(i));
    }

}



