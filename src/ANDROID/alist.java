package ANDROID;

import java.util.ArrayList;
import java.util.Scanner;

public class alist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i =0; i<10; i++){
            System.out.println(list.get(i));
        }
        //swapSystem.out.println(list);
    }

}
