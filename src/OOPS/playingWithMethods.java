package OOPS;

public class playingWithMethods {
    public static void welcome(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        NewFunctions Ne = new NewFunctions(); // created an object of Newfunction
        welcome(); // we didn't create an object for this method as this method is in same class
        Ne.first();
        Ne.second();
        System.out.println("Hi, falana dhimakana");
        Function2 n = new Function2();
        n.first();
        n.second();
    }
}
class NewFunctions{
    void first(){
        System.out.println("fist");
    }
    void second(){
        System.out.println("Second");
    }
}
class Function2{
    void first(){
        System.out.println("Second function fist  method");
    }
    void second(){
        System.out.println("Second function second method");
    }
}
