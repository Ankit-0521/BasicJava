package RECURSION;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerThree(12));
    }
    static boolean isPowerThree(int n){
        if(n%3 !=0 && n!=1){
            return false;
        }
        if(n==1 || n==3){
            return true;
        }
        return isPowerThree(n/3);
    }
}
