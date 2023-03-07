package ANDROID;

public class MountainArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,4,3,2,1};
        System.out.println(search(ar,5));
        System.out.println(peakIndexInMountainArray(ar));
    }
    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int FirstTry  = orderAgnosticBS(arr,target, 0, peak);
        if (FirstTry != -1){
            return FirstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end - start) / 2;
            if (arr[mid]> arr[mid+1]){
                // you are in dec part of array
                //this may be the ans, but look at left
                // this is why end != mid -1;
                end = mid;
            }
            else {
                start = mid + 1; // because we know that mid +1 element > mid element
            }
        }
        // in the end start ==  end and pointing to the largest number because of the 2 check above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that what the check say
        //  more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only item is remaining, hence coz of above line that is the best possible ans.
        return arr[start]; // or return end.
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){


        // find whether the array is sorted in asc or in desc;
        boolean isAsc = arr[start]< arr[end];

        while (start<=end){
            //find the middle element;
            //  int mid = (start+end)/2;   problem : (integer has fixed sized)
            // it might be possible that (start + end) exceeds the range of int in java.
            int mid = start + (end-start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target< arr[mid]){
                    end = mid-1;
                }
                else if (target>arr[mid]){
                    start = mid +1;
                }
            }
            else {
                if(target> arr[mid]){
                    end = mid-1;
                }
                else if (target<arr[mid]){
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
