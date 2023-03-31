package ANDROID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count, and Marc can walk a distance to expend those calories. If Marc has eaten  cupcakes so far, after eating a cupcake with  calories he must walk at least 2^i * C miles to maintain his weight.
//
//Example
//
//If he eats the cupcakes in the order shown, the miles he will need to walk are . This is not the minimum, though, so we need to test other orders of consumption. In this case, our minimum miles is calculated as .
//
//Given the individual calorie counts for each of the cupcakes, determine the minimum number of miles Marc must walk to maintain his weight. Note that he can eat the cupcakes in any order.
//
//Function Description
public class CakeNWalks {
    public long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        int n = calorie.size();
        long ans = 0;
        Collections.sort(calorie);
        for(int i = 0; i<n; i++){
            ans += (long)calorie.get(n-i-1)<<i;
        }
        return ans;

    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.addAll(Arrays.asList(7,4,9,6));
        CakeNWalks ck = new CakeNWalks();
        System.out.println(ck.marcsCakewalk(li));
    }
}
