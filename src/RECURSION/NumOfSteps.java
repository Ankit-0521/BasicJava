package RECURSION;
// Given an integer num, return the number od steps to reduce it to zero
// in one step, if the current is even u have to divide by 2
// else u have to subtract by 1
public class NumOfSteps {
    public static void main(String[] args) {
        System.out.println(steps(43));
    }
    static int steps(int num){
        return helper(num, 0);
    }
    // we need to pass this values in recursion call
    // and i can pass values in recursion calls by putting into arguments, that's why we use helper function.
    static int helper(int num, int steps){
        if (num==0){
            return steps;
        }
        if (num % 2== 0){
            return helper(num/2, steps +1);
        }
        return helper(num -1, steps + 1);
    }
}
