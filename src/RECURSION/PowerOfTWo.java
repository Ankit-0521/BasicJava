package RECURSION;
//Given an integer n, return true if it is a power of two. Otherwise, return false.

//An integer n is a power of two, if there exists an integer x such that n == 2x.
public class PowerOfTWo {
    public static void main(String[] args) {
        System.out.println(isPower(6));
    }
    static boolean isPower(int n){
        if (n==1){
            return true;
        }else if (n % 2 ==1 || n==0){
            return false;
        }
        return isPower(n/2);
    }
}
