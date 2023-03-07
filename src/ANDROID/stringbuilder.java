package ANDROID;

public class stringbuilder {
    public static void main(String[] args) {


        StringBuilder s = new StringBuilder("Ankit Gupta");
        s.reverse();
        System.out.println(s);

        String sh = new String("Ankit Gupta");

        String res = "";
        for (int i = sh.length() - 1; i >= 0; i--)
            res = res + sh.charAt(i);
        System.out.println(res);
    }

}
