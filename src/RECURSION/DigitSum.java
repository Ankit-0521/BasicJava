package RECURSION;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sum(345));
        System.out.println(ProductOfDigit(5454));
    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
    static int sumOfDigit(int n){
        if (n<=0){
            return 0;
        }
        return (n%10) +sumOfDigit(n/10);
    }
    static int ProductOfDigit(int n){
        if (n%10==n){
            return n;
        }
        return (n%10) * ProductOfDigit(n/10);
    }
}
