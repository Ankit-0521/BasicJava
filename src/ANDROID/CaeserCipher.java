package ANDROID;
//Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
//
//Original alphabet:      abcdefghijklmnopqrstuvwxyz
//Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
public class CaeserCipher {
    public  String caesarCipher(String s, int k) {
        // Write your code here
        if(k==0) return s;
        char[] charArr = s.toCharArray();
        for(int i = 0; i<charArr.length; i++){
            char ch = charArr[i];
            if(ch>='a' && ch<='z'){
                ch = (char) (97 + ((ch+k-97)%26));
            } else if(ch>='A' && ch<='Z'){
                ch = (char)(65+((ch+k-65)%26));
            }
            charArr[i]=ch;
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        CaeserCipher cs = new CaeserCipher();
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(cs.caesarCipher(s,5));
    }
}
