package ANDROID;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for (int start = 0; start< arr.length; start++){
            for (int end = start; end<arr.length; end++){
                for (int k = start; k<=end; k++){
                    System.out.print(arr[k]+"");
                }
                System.out.println();
            }
        }
    }
}
