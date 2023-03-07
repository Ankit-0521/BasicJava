package ANDROID;
import java.util.Scanner;
class area{
    int a, b, c;
    int length, breadth;
    public area(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double a_tri(){
        int s = (a +b + c)/2;
        int arr = (s*(s-this.a)*(s-this.b)*(s-this.c));
        return Math.sqrt(arr);
    }
    public int p_tri(){
       int p = (this.a + this.b + this.c)/2;
        return p;
    }
    public int a_rect(){
        int r;
        r = this.length * this.breadth;
        return r;
    }
    public int p_rect(){
        int p = 2 * (this.length + this.breadth);
        return p;
    }
}
public class shapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        area rec = new area(a,b);
        System.out.println(rec.a_rect());
        System.out.println(rec.p_rect());
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();
       area tr = new area(t1, t2, t3);
       double ar = tr.a_tri();
        System.out.println(ar);
        System.out.println(tr.p_tri());
    }
}
