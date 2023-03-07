package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 34.2343f;
        System.out.printf("Formatted number is  %.2f", a);
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello My name is %s and I am a %s", "Ankit", "student");
    }
}