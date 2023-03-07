package DSA;

import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {

        //pascalUsingTwoDimension();
        pascalUsingDynamicArray();
    }

    static void pascalUsingTwoDimension(){
        int[][] tri = new int[20][];
        for (int r = 0; r < tri.length; r++) {
            tri[r] = new int[r+1];
            tri[r][0] =1;
            tri[r][r] = 1;
            for (int c = 1; c < r; c++) {
                tri[r][c] = tri[r-1][c]+tri[r-1][c-1];
            }
        }
        for (int r = 0; r < tri.length; r++) {
            for (int c = 0; c < tri[r].length; c++) {
                System.out.print(" "+tri[r][c]);
            }
            System.out.println("");
        }
    }

    static void pascalUsingDynamicArray(){
        int[] previous = {};
        int[] current = null;
        for (int r = 1; r < 17; r++) {
            current = new int[previous.length+1];
            current[0] = 1;
            current[previous.length] = 1;
            for (int c = 1; c < previous.length; c++) {
                current[c] = previous[c]+ previous[c-1];
            }
            previous = current;
        }
        for (int r = 0; r < current.length; r++) {
            System.out.print(" "+ current[r]);
        }
        System.out.println(" ");
    }
}
