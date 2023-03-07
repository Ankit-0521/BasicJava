package ANDROID;

public class sqrt {
    public static void main(String[] args) {

        System.out.println(mySqrt(10));
    }

    static int mySqrt(int x) {
        if (x == 1) return 1;
        long l = 1;
        long h = x;
        while (l < h) {
            long m = l + (h - l) / 2;
            if (m*m <= x) l = m + 1;
            else h = m;
        }
        return (int) l - 1;
        }
    }

