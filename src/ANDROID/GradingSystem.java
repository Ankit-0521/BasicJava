package ANDROID;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//HackerLand University has the following grading policy:
//
//Every student receives a  in the inclusive range from  to .
//Any  less than  is a failing grade.
//Sam is a professor at the university and likes to round each student's  according to these rules:
//
//If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
//If the value of  is less than , no rounding occurs as the result will still be a failing grade
public class GradingSystem {
    List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int ans = 0;
        List<Integer> li = new ArrayList<>();
        for(int i =0; i<grades.size(); i++){
            if (grades.get(i)<38){
                li.add(i,grades.get(i));
            }
            else {
                int q = grades.get(i) / 5;
                int rem = grades.get(i) % 5;
                if (rem >= 3) {
                    li.add(i, (q + 1) * 5);
                } else {
                    li.add(i, grades.get(i));
                }
            }
        }
        return li;
    }

    public static void main(String[] args) {
        GradingSystem ss = new GradingSystem();
        List la = new ArrayList();
        la.addAll(Arrays.asList(73,67,68,38,36));
        System.out.println(ss.gradingStudents(la));
    }
}
