package ANDROID;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = { 'c', 'g', 'j'};
        char target = 'g';
        System.out.println(Ceiling(arr,target));
    }
    static char Ceiling(char[] letter, char target){
        
        int start = 0;
        int end = letter.length-1;

        while ( start<= end){
            int mid = start +(end-start)/2;

            if(target< letter[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }


        }
        return letter[start % letter.length];
    }
}
