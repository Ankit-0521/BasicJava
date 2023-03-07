interface Printem
{
    void printText();
}
class class1 implements Printem {
    public void printText()
    {
        System.out.println("Hello from Java!");
    }
}













public class interfaces {
    public static void main(String[] args)
        {
            class1 object1 = new class1();
            object1.printText();
        }

}
