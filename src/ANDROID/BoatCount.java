package ANDROID;
import java.util.Arrays;
//You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
//
//Return the minimum number of boats to carry every given person.
public class BoatCount{
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat = 0;
        int i = 0, j= people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                boat++;
                i++;
                j--;
            }else{
                j--;
                boat++;
            }
        }
        return boat;
    }

    public static void main(String[] args) {
        int[] people = {3,4,6,8,9,2,1,7};
        BoatCount bc = new BoatCount();
        System.out.println(bc.numRescueBoats(people,8));
    }
}
