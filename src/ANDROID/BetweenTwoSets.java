package ANDROID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
//
//The elements of the first array are all factors of the integer being considered
//The integer being considered is a factor of all elements of the second array
//These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
 class BetweenTwoSets {
     int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int n = a.size();
        int m = b.size();
        int count =0;
        for(int i = 1; i<=100; i++){
            boolean ok = true;
            for(int j = 0; j<n && ok; j++){
                if(i % a.get(j) != 0) {
                    ok = false;
                }
            }
            for(int j = 0; j<m && ok; j++){
                if(b.get(j)%i != 0){
                    ok = false;
                }
            }
            if(ok) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,4));
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(16,32,96));
        System.out.println(list2);
        BetweenTwoSets bb = new BetweenTwoSets();
        System.out.println(bb.getTotalX(list,list2));
    }
}
