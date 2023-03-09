package Strings;
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class OccurenceOfSubString {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        int i = 0, j=0, k = 0;
        if(n1<n2) return -1;
        while(i<n1 && j<n2){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                i = k+1;
                j = 0;
                k = i;
            }
        }
        if(j==n2) return k;
        else return -1;
    }

    public static void main(String[] args) {
        String h = "paparazzi";
        String n = "raz";
        OccurenceOfSubString oc = new OccurenceOfSubString();
        int ans = oc.strStr(h,n);
        System.out.println(ans);
    }
}
