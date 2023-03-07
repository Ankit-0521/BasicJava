package ANDROID;
class FindNegativeNum{
    public static void main(String[] args) {
        int[][] arr = {{6,3,1},
                {5,-1,-2},
                {-1,-2,-4}};
        System.out.println(countNegatives(arr));
    }
    static int countNegatives(int[][] grid){
        int sum = 0;
        for (int[] arr : grid) {
            int count = BS1(arr);
            sum += count;
        }
        return sum;
    }


    static int BS1(int[] arr){
        int count = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] >= 0){
                start = mid + 1;
            } else {
                count = arr.length - mid;
                end = mid -1;
            }
        }
        return count;
    }

}