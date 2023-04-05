package ANDROID;
//Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.
//
//Return the minimum number of substrings in such a partition.
//
//Note that each character should belong to exactly one substring in a partition.


import java.util.HashMap;
import java.util.Map;

public class PartionString {
    public int partitionString(String s) {
        int map = 0;
        int count = 1;
        for(char c : s.toCharArray()){
            if((map & (1<<c)) != 0) {
                count++;
                map = 0;
            }
            map ^= (1<<c);
        }
        return count;
    }
    public int partitionString2(String s) {
        int count = 0, i = 0;
        Map<Character, Boolean> map = new HashMap<>();
        while(i<s.length()){
            if(map.containsKey(s.charAt(i))){
                count++;
                map.clear();
            }
            map.put(s.charAt(i),true);
            i++;
        }
        return count+1;
    }

    public static void main(String[] args) {
        String s = "abacdacxda";
        PartionString ps = new PartionString();
        System.out.println(ps.partitionString(s));
    }
}
