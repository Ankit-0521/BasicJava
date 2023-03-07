package ANDROID;
import java.lang.String;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Day3 {

    public static void main(String[] args) {
     //String name = " Niloy";
      //  String name1 = new String(" Nilansh");
        // System.out.println(name);
      //  System.out.println(name1);

      /*  String str = "Corona";
       // System.out.println(str.charAt(4));
       // System.out.println(str.substring(2));
       // System.out.println(str.substring(0,10));
        System.out.println(str+" Delhi");
       str= str.concat(" Delhi");
        System.out.println(str);
        System.out.println(str.indexOf('o'));
                System.out.println(str.startsWith("Co"));
       */
     /*   String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3 = new String("hello"); // it stores the value in separate address.
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.toLowerCase());
        str1 = str1.replace('e','a');
        System.out.println(str1);

      */
        //Immutable
        //String s = "Hello";
       // s = s + " Bye";


        // Mutable.
      /*  StringBuilder sb = new StringBuilder("Corona");
        sb.append(" Go");
        System.out.println(sb);
        sb.insert(2,'e');
        System.out.println(sb);
        sb.replace(1,3,"tomy");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());

       */
       //StringBuilder s = new StringBuilder("Ankit Gupta");
        //s.reverse();
        //System.out.println(s);

       // String s = new String("Ankit Gupta");

        //String res = "";
       // for (int i=s.length()-1; i>=0; i--)
         //   res = res + s.charAt(i);
       // System.out.println(res);

       Scanner sc = new Scanner(System.in);
      /*   System.out.println("Enter the new String");
         String  str = sc.next();
         int flag =0;
            for (int i=0, j=str.length()-1; i<j; i++, j--)
            {
                if(str.charAt(i)!=str.charAt(j))
                    flag = 1;
                break;
            }
            if (flag==0)
                System.out.println("Palindrome");
            else
        System.out.println("Not Palindrome");

      */

        // Random
        // System.out.println(Math.random());
        //Random r = new Random();
        //int value = r.nextInt(6-1+1) +1;
       // System.out.println(value);

        System.out.println("Enter num 1");
        int a = sc.nextInt();
        System.out.println("Enter num 2");
        int b = sc.nextInt();
        int small = a<b?a:b;
        int lar = a>b?a:b;
       while (small!=0)
       {

            int ques = lar/small;
            int rem = lar%small;
            lar=small;
            small= rem;
        }
        System.out.println("GCD = " +lar);
        System.out.println("LCM = " +(a+b)/lar);

        // program to find the greatest of three numbers.
      /*  System.out.println("Enter num 1");
        int a=sc.nextInt();
        System.out.println("Enter num 2");
        int b=sc.nextInt();
        System.out.println("Enter num 3");
        int c=sc.nextInt();
        int lar = a>b?a>c?a:b>c?b:c:b>c?b:c;
        System.out.println(lar);
       */
    }
}
