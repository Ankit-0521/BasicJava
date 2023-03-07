package RECURSION;
//Given an integer n, return the least number of perfect square numbers that sum to n.

//A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
// ans Recursion using Memoization -
import java.util.HashMap;

public class PrefectSquare {
    public static void main(String[] args) {
        System.out.println(numSquare(12));
    }
    static int numSquare(int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        return find(n, map);
    }

     static int find(int n, HashMap<Integer, Integer> map) {
        if (n<=3){
            return n;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }
        int min = Integer.MAX_VALUE;
         for (int i = 1; i*i <=n; i++) {
             min = Math.min(min,find(n-i*i,map)+1);
         }
         map.put(n,min);
         return min;
    }
}
