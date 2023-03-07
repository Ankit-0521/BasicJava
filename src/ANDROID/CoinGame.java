package ANDROID;

public class CoinGame {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    static int arrangeCoins(int n) {
        if(n==1)
            return 1;
        int l =1, r = n;
        int count =0;
        while(l<=r){
            long m =(long) l +(r-l)/2;
            long t = (long)(m*(m+1))/2;
            if(t<=n){
                count=(int)m;
                l = (int)m+1;

            }
            else
                r = (int)m-1;
        }
        return count;
    }
}