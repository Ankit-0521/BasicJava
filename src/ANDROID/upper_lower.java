package ANDROID;

public class upper_lower {
    public static void main(String[] args) {
        StringBuilder   s = new StringBuilder("Tajmahal");
        for (int i=0; i<s.length()-1; i++)
        {
        if (Character.isUpperCase(s.charAt(i)))
        {
            char ch = Character.toLowerCase(s.charAt(i));
            s.replace(i, i+1, ch+"");
        }
        else {
              char ch = Character.toUpperCase(s.charAt(i));
               s.replace(i, i+1, ch+ "");
        }
    }
        System.out.println(s);
    }
}
