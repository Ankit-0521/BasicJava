package ANDROID;
//Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result
// of a sequence of push and pop operations on an initially empty stack, or false otherwise.

import java.util.Stack;

public class ValidateStackSequence {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0;
        int j=0;
        for(int val : pushed){
            pushed[i++]=val;
            while(i>0 && pushed[i-1]==popped[j]){
                i--;
                j++;
            }
        }
        return i==0;
    }

    public boolean validateStackSequences1(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int val : pushed){
            stack.push(val);
            while(!stack.isEmpty() && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed={1,2,3,4,5};
        int[] popped = {3,2,1,5,4};
        ValidateStackSequence vf = new ValidateStackSequence();
        System.out.println(vf.validateStackSequences(pushed,popped));
    }
}
