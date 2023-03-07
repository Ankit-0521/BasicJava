package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.printf(series);
        // not good solution because it is creating new object every time
        // and copying the old one and appending the new changes

    }
}
