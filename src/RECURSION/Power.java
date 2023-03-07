package RECURSION;
// Power of four
public class Power {
    public static void main(String[] args) {
        System.out.println(powerfour(15));
    }
    static boolean PowerFour(int n){
        if (n == 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        long a = 4;
        while ((int)a <= n){
            if (a==n){
                return true;
            }else {
                a *= 4;
                if (a>=Integer.MAX_VALUE){
                    break;
                }
            }


        }
            return false;
    }


    static boolean powerfour(int n){
        if ( n==0){
            return false;
        }
        if (n == 1){
            return true;
        }
        if (n % 4 !=0){
            return false;
        }
        return powerfour(n/4);
    }
}
