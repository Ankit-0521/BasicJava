import com.sun.nio.sctp.PeerAddressChangeNotification;

interface calculate
{
    public int compute( int x, int y);
}
class Add implements calculate
{
    public int compute(int a, int b)
    {
        return ( a + b);
    }
}
class Multiply implements calculate
{
    public int compute( int a, int b )
    {
         return ( a * b );
    }
}
class MyInterface {
    public static void main(String[] args) {
        Add A = new Add();
        Multiply M = new Multiply();
        calculate cal;
        cal = (calculate) A; //casting
        System.out.println("Sum : " + cal.compute(2, 3));

        cal = (calculate) M; //casting
        System.out.println("Multiplication :" + cal.compute(2, 3));
    }
}