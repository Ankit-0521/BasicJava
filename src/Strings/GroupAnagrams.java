package Strings;

import java.util.*;

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.groupAnagrams(str));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs== null || strs.length==0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] carr = s.toCharArray();
            Arrays.sort(carr);
            String keystr = String.valueOf(carr);
            if(!map.containsKey(keystr)){
                map.put(keystr,new ArrayList<>());
            }
            map.get(keystr).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagram(String[] strs) {
        Map<String,List<String>> temp = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!temp.containsKey(s))
            {
                temp.put(s, new ArrayList<>());
            }
            temp.get(s).add(strs[i]);
        }
        return new ArrayList(temp.values());
    }
}
