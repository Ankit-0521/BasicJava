package ANDROID;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {22, 23, 443, 555, 65, -2, -2, 32};
        int target = 32;
        int ans = linearSearch(nums, target);
        int res=linearSearch2(nums, target);
        System.out.println(res);
        System.out.println(ans);
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return element;
            }

            // this line will execute if none of the return statements above have executed
            // hence the target mot found

        }
        return -1;
    }
        // search in the array: return the index if item found
        // otherwise if item not found return -1
        static int linearSearch( int[] arr, int target){
            if (arr.length == 0) {
                return -1;
            }
            // run a for loop
            for (int index = 0; index < arr.length; index++) {
                // check for element at every index if it is = target
                int element = arr[index];
                if (element == target) {
                    return index;
                }
            }
            // this line will execute if none of the return statements above have executed
            // hence the target mot found
            return -1;


        }
    }
