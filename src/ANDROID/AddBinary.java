package ANDROID;
//Given two binary strings a and b, return their sum as a binary string.

//Example 1:
//
//Input: a = "11", b = "1"
//Output: "100"
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry= 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            ans.append(sum%2);
        }
        if(carry!=0) ans.append(carry);
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary ab = new AddBinary();
        String a = "100";
        String b = "10";
        System.out.println(ab.addBinary(a,b));
    }
}
