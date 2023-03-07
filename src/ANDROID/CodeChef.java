package ANDROID;
import java.util.Scanner;
public class CodeChef {

    public static void main (String[] args)
        {
            // your code goes here
            Scanner sc= new Scanner(System.in);


            int a=sc.nextInt();
            int b=sc.nextInt();
            int N=sc.nextInt();
            int ans=Fib(a,b,N);
            System.out.println(ans);

        }
        static int  Fib(int a, int b, int N){

            if(N ==0){
                return a;
            }
            if(N==1){
                return b;
            }
            if(N==2){
                return a^b;
            }
            return Fib(a,b,N%3);
    }

}
