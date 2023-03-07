package RECURSION;

public class MinAndMaxElement {
    public static void main(String[] args) {
        int[] arr = { -2,1,3,4,043,-3,4,43};
        int n = arr.length;
        System.out.println(MinElement(arr,n));
        System.out.println(MaxElement(arr,n));
    }
    static int MinElement(int[] arr, int n){  // for min element
        if (n== 1){
            return arr[0];
        }
       return Math.min(arr[n-1],MinElement(arr,n-1));
    }


    static int MaxElement(int[] arr, int n){
        if (n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],MaxElement(arr,n -1));
    }
}
