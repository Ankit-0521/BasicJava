package Strings;
// Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.

// Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String

//Example.

//aab shortens to b in one operation: remove the adjacent a characters.

//Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.

public class SuperReducingString {

     String superReducedString(String s) {
        // Write your code here
         boolean changed = false;
         do {
             changed = false;
             for (int i = 0; i < s.length(); i++) {

                 if (i == s.length() - 1) continue;
                 if (s.charAt(i) == s.charAt(i + 1)) {
                     changed = true;
                     s = s.substring(0, i) + s.substring(i + 2);
                 }
             }
         }while (changed);
            if (s.equals("")) {
                return "Empty String";
            }


        return s;
    }

    public static void main(String[] args) {
        String s= "baab";
        SuperReducingString sp = new SuperReducingString();
        System.out.println(sp.superReducedString(s));

    }

}
