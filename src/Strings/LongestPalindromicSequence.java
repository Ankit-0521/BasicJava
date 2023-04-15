package Strings;

public class LongestPalindromicSequence {
    public int longestPalindromeSubseq(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            s1.insert(0, s.charAt(i));
        }
        return lcs(s, s1.toString());
    }
    private int lcs(String s1, String s2){
        int[][] temp= new int[s1.length()+1][s2.length()+1];
        for(int i = 1; i<s1.length()+1; i++){
            for(int j = 1; j<s2.length()+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    temp[i][j]=temp[i-1][j-1]+1;
                }else{
                    temp[i][j]=Math.max(temp[i-1][j],temp[i][j-1]);
                }
            }
        }
        return temp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s = "bbab";
        LongestPalindromicSequence ls = new LongestPalindromicSequence();
        System.out.println(ls.longestPalindromeSubseq(s));
    }
}
