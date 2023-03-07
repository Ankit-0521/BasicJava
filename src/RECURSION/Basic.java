package RECURSION;

public class Basic {
    public static void main(String[] args) {
            int n = 546;
        System.out.println(fact(n));
    }
    static void fun(int n){
        if (n==0){
            return;
      }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        funRev(n-1);
    }
    static void funBoth(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
    static int fact(int n){
        if (n<=1){
            return 1;
        }
        return n * fact(n-1);
    }


}
