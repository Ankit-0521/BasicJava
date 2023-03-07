package ANDROID;



public class maxelement {
    public static void main(String[] args) {
        int[] arr = {21,23,43,55,32};
        System.out.println(maxRange(arr,1,4));
    }
    static int maxRange(int[] arr, int start, int end){
        int maxval = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
