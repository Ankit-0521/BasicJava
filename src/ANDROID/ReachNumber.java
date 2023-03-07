package ANDROID;

import java.util.Map;

public class ReachNumber {
    public static void main(String[] args) {
        System.out.println(ReachNum(9));
    }
    static int ReachNum(int target){
        int sum = 0;
        int step = 0;
        if (target ==0)
            return 0;
        target = Math.abs(target);
        while (sum<target){
            sum = sum + step;
            step++;
        }
        while ((sum - target) %2 != 0){
            sum += step;
            step++;
        }
        return step -1;
    }
}
