package ANDROID;
import java.util.Arrays;

public class passingfuctions {
    public static void main(String[] args) {
        int[] num = {3,4,5,6,4};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[]  arr){
        arr[0] = 99;
    }
}
