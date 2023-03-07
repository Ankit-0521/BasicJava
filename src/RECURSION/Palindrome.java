package RECURSION;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1234321));
    }
    static boolean palin(int n){
        return n == ReverseNum.rev2(n);

    }

}
