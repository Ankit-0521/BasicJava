package Strings;

import java.util.Scanner;

public class RabinKarpAlgo {
    private int getHash(String s, int si, int li){
        int hash=0;
        for (int i = si; i <= li; i++) {
            hash+=(int)s.charAt(i);
        }
        hash = hash%31;
        return hash;
    }
    public int patternMatchingRK(String s, String pattern){
        int n = s.length();
        int m = pattern.length();
        int hashP = getHash(pattern,0,m-1);
        int[] hashcache = new int[n-m+1];
        for (int i = 0; i <hashcache.length; i++) {
            hashcache[i] = getHash(s,i,i+m-1);
        }
        for (int i = 0; i <= (n-m); i++) {
            if (hashP==hashcache[i]){
                if (matcher(s,pattern,i)) return i;
            }
        }
        return -1;
    }

    private boolean matcher(String s, String pattern, int si) {
        for (int j = 0; j < pattern.length(); j++) {
            if (s.charAt(j+si)!=pattern.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "lucknowgorakhpursiwansiswabazarchandigarh";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city to found it's first index");
        String pattern = sc.nextLine();
        RabinKarpAlgo rp = new RabinKarpAlgo();
        int fi = rp.patternMatchingRK(str,pattern);
        System.out.println(fi);
    }
}
