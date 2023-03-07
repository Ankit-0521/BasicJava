package RECURSION;

public class Sorted {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,63,7};
            System.out.println(sorting(arr,0));
    }
    static boolean sorting(int[] arr, int index){
        // base condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorting(arr,index + 1);
    }
}
