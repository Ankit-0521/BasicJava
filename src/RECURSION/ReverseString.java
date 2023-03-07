package RECURSION;
// Write a function that reverses a string. The input string is given as an array of characters s.

//You must do this by modifying the input array in-place with O(1) extra memory.

public class ReverseString {
    public static void main(String[] args) {

    }
    static void reverseString(char[] s){
            rec(s, 0);
    }
    static void rec(char[] s, int i){
        if (s == null || i>=s.length/2){
            return;
        }
        char c = s[i];
        s[i]=s[s.length - i - 1];
        s[s.length - i - 1] = c;

        rec(s, i + 1);
    }
}
