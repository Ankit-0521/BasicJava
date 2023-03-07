package DSA;

public class Solution {

        public static void pairSum(int[] arr, int s) {
            int n = arr.length;
            for(int i = 0; i<arr.length-1; i++){
                for(int j = i + 1; j< arr.length; j++){
                    if(arr[i]  + arr[j] == s){
                        System.out.println(+arr[i]+ "," +arr[j]);
                        return;
                    }
                }
            }
            System.out.println("Pair not found");
        }
        public static void main(String[] args)
        {
            int[] arr= {1, 2, 3, 4, 5};
            int s = 5;
            pairSum(arr, s);
        }

}
