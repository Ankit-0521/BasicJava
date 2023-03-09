package Strings;
//Given an array of characters chars, compress it using the following algorithm:
//
//Begin with an empty string s. For each group of consecutive repeating characters in chars:
//
//If the group's length is 1, append the character to s.
//Otherwise, append the character followed by the group's length.
//The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
//
//After you are done modifying the input array, return the new length of the array.
//You must write an algorithm that uses only constant extra space.
public class StringCompress {
    public int compress(char[] chars){
        int i = 0, j = 0;
        while (i<chars.length){
            int count = 1;
            while (i< chars.length -1 && chars[i]==chars[i+1]){
                i++;
                count++;
            }
            chars[j++] = chars[i++];
            if (count>1){
                String str = String.valueOf(count);
                for (int k = 0; k < str.length(); k++) {
                    chars[j++] = str.charAt(k);
                }
            }
        }
        return j;
    }

    public static void main(String[] args) {
        char[] ch = {'a','a','b','b','d','c','c','c'};
        StringCompress sc = new StringCompress();
        int ans = sc.compress(ch);
        System.out.println(ans);
    }
}
