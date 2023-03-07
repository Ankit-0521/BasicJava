package RECURSION;
//Given an integer num, return the number of steps to reduce it to zero.

//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
public class StepsCount {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    static int numberOfSteps(int num) {
        return recursiveMethod(num,0);
    }

    private static int recursiveMethod(int num, int count) {
        if (num<=0){
            return count;
        }
        if (num%2 == 0){
            return recursiveMethod(num/2,++count);
        }
        return recursiveMethod(num-1, ++count);
    }
}
