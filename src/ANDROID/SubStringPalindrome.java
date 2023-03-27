package ANDROID;

public class SubStringPalindrome {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i = 0; i<s.length(); i++){
            String resOdd = generatePalindrome(s,i,i);
            if(res.length()<resOdd.length()) res = resOdd;
            String resEven
                    = generatePalindrome(s,i,i+1);
            if(res.length()<resEven.length()) res = resEven;
        }

        return res;
    }

    public String generatePalindrome(String s, int l, int r){
        String res = "";
        while(l>=0 && r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                if(l==r) res += s.charAt(l);
                else res = s.charAt(l) + res + s.charAt(r);
            }
            else break;
            l--;
            r++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "bababbsscd";
        SubStringPalindrome sp = new SubStringPalindrome();
        System.out.println(sp.longestPalindrome(s));
    }
}
