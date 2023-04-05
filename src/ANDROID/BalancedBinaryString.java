package ANDROID;

public class BalancedBinaryString {
    public int findTheLongestBalancedSubstring(String s) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<s.length(); i++){
            int j = 0, k = 0;
            while(i<s.length() && s.charAt(i)=='0'){
                j++;
                i++;
            }
            while(i<s.length() && s.charAt(i)=='1' && j>0){
                k++;
                i++;
                max = Math.max(max,j+k+1);
            }
            while(i<s.length() && s.charAt(i)=='1') i++;
        }
        return max;
    }
    public int find2(String s){
        String temp = "01";
        int res = 0;
        while (temp.length()<=s.length()){
            if (s.contains(temp)) {
                res = temp.length();
            }
            temp = "0"+temp+"1";
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "01000111";
        BalancedBinaryString bs = new BalancedBinaryString();
        System.out.println(bs.find2(s));
        System.out.println(bs.findTheLongestBalancedSubstring("011"));
    }
}
