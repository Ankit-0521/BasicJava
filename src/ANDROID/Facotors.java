package ANDROID;

public class Facotors {


    public static void main(String[] args) {

        int num = 8;
        int j = 1;
        while (j<=num){
            System.out.print(j);
            for(int i = 1; i <= j; ++i) {
                //check if i is a factor of num
                if (j % i == 0) {
                    System.out.print(" " +i);
                }

            }
            System.out.println();
            j++;
        }
    }
}
