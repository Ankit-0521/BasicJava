package ANDROID;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    public static ArrayList<Integer> breakingRecords(ArrayList<Integer> scores) {
        // Write your code here
        List<Integer> li = new ArrayList<>();
        int min = scores.get(0), max = scores.get(1), countMin = 0, countMax = 0;
        for(int i = 0;i<scores.size(); i++){
            if(scores.get(i)<min){
                min = scores.get(i);
                countMin++;
            }
            if(scores.get(i)>max){
                max = scores.get(i);
                countMax++;
            }

        }
        li.set(0,countMax);
        li.set(1,countMin);

        return (ArrayList<Integer>) li;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

    }

}
