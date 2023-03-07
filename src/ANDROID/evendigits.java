package ANDROID;

public class evendigits {
    public static void main(String[] args) {
        int[] nums = {12,234,4232,32321,334,0, -32,-3222};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(23));
    }
    static int findNumbers(int[] nums){
        int ans = 0;
        for (int num: nums) {
            if(even(num)){
                ans++;
            }
        }
        return ans;
    }

     static boolean even(int num) {
            int numberofdigits = digits(num);
            if (numberofdigits %2==0){
                return true;
            }
         return false;
    }


    static int digits(int num){
        if (num<0){
            num *= -1;
        }
        if (num==0){
            return 1;
        }
        int count = 0;
        while (num>0){
           count++;
           num/= 10;
        }
        return count;
    }
    static int digits2(int num){
        return (int)(Math.log10(num)) + 1;
    }
}
