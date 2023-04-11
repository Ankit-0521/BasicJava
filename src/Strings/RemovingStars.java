package Strings;
import java.util.Stack;

//You are given a string s, which contains stars *.
//
//In one operation, you can:
//
//Choose a star in s.
//Remove the closest non-star character to its left, as well as remove the star itself.
//Return the string after all stars have been removed.
//
//Note:
//
//The input will be generated such that the operation is always possible.
//It can be shown that the resulting string will always be unique.
//
public class RemovingStars {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }else{
                st.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public String removeStars2(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                str.deleteCharAt(str.length()-1);
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        RemovingStars rs = new RemovingStars();
        System.out.println(rs.removeStars(s));
    }
}
