package OOPS;

public class Singleton {
    public static void main(String[] args) {
        Single s1 = Single.getInstance(10);
        s1.display();
        Single s2 = Single.getInstance(22);
        s2.display();
    }
}

class Single{
    private int x;
    Single(int a){
        x=a;
    }
    public void display(){
        System.out.println("value of x = "+x);
        x++;
    }
    private static Single s = null;
    public static Single getInstance(int a){
        if (s == null){
            s = new Single(a);
        }
        return s;
    }
}
