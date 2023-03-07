package ANDROID;

public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    static int findKthPositive(int[] arr, int k) {
        if(k < arr[0])
            return k;

        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(countMissing(arr[mid], mid) < k) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return arr[end] + k - countMissing(arr[end], end);
    }

    static int countMissing(int num, int idx) {
        return num - idx - 1;
    }
}
