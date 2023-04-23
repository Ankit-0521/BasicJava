package ANDROID;

import java.util.Collections;
import java.util.List;

//Geek is organizing a carnival this summer in which he has called N number of students. He has also booked M number of buses with each of them having a capacity of C. The time of arrival of N students is given by an array arr where i'th index (1 ≤i≤N) denotes the time of arrival of i'th student. Geek doesn't want his students to wait for too long. Find the smallest value of the maximum waiting time any student has to wait.
//
//Waiting time is the difference between his arrival and bus departure.It is always possible to accomodate all the students.
//
//Example 1:
//
//Input:
//
//n = 4, m = 3, c = 3 arr = 5 3 7 8
//
//Ouput:
//
//1
public class MinimumWaitingTime {
    public int minimumWaitTime(int n, int m, int c, List<Integer> arr){
        Collections.sort(arr);
        int left = 0, right = arr.get(n-1) - arr.get(0), ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(n, m, c, arr, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public static boolean check(int n, int m, int c, List<Integer> arr, int maxWait) {
        int busesRequired = 1;
        int studentsInBus = 0;
        int departureTime = arr.get(0) + maxWait;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) > departureTime || studentsInBus == c) {
                busesRequired++;
                studentsInBus = 1;
                departureTime = arr.get(i) + maxWait;
            } else {
                studentsInBus++;
            }
        }
        return (busesRequired <= m);
    }
}
