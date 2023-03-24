//Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
//
//Lily decides to share a contiguous segment of the bar selected such that:
//
//The length of the segment matches Ron's birth month, and,
//The sum of the integers on the squares is equal to his birth day.
//Determine how many ways she can divide the chocolate.
//
//Example

//Lily wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria:  and .
//
//Function Description
//
//Complete the birthday function in the editor below.
//
//birthday has the following parameter(s):
//
//int s[n]: the numbers on each of the squares of chocolate
//int d: Ron's birth day
//int m: Ron's birth month
//Returns
//
//int: the number of ways the bar can be divided
package ANDROID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.addAll(Arrays.asList(2,2,1,3,2));
        SubArrayDivision sb = new SubArrayDivision();
        int ans = sb.birthday(li,4,2);
        System.out.println(ans);
    }
     int birthday(List<Integer> s, int d, int m) {
        int n = s.size();
        int res = 0;
        for(int i = 0; i<n-m+1; i++){
            int tempres = 0;
            for(int j = i; j<i+m; j++){
                tempres += s.get(j);
            }
            if(tempres == d) res++;
        }
        return res;
    }
}
