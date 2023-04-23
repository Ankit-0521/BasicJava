package Strings;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length()-1;

        while(left<=right){
            char fi = s.charAt(left);
            char li = s.charAt(right);
            if(!Character.isLetterOrDigit(fi)){
                left++;
            }else if(!Character.isLetterOrDigit(li)){
                right--;
            }else{
                if(Character.toLowerCase(fi)!=Character.toLowerCase(li)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome(s));
    }
}
