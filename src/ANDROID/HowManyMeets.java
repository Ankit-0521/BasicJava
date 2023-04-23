package ANDROID;
//Geek and Geekina are running on a running track. They love meeting each other. Geek can complete a lap in A seconds
// and Geekina can complete a lap in B seconds. Both start running at the same time and both can run atmost for C
// seconds. Find the number of times they can meet on the starting point after they have started running.
//
//Example 1:
//
//Input:
//
//A = 3, B = 3
//
//A
//
//C = 9
//
//Output:
//
//3


public class HowManyMeets {
    public long meetThem(long A, long B, long C){
        long lcm = (A*B)/gcd(A,B);
        long meet = C/lcm;
        return meet;
    }
    public static long gcd(long a, long b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }

}
