package RECURSION;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        subset("","abc");
        System.out.println(subset1("","abc"));


    }
    static void subset(String p,String alpha){
        if (alpha.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = alpha.charAt(0);

            subset(p + ch, alpha.substring(1));

            subset(p,alpha.substring(1));
    }

    static ArrayList<String> subset1(String p, String alpha){
        if (alpha.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = alpha.charAt(0);

        ArrayList<String> left = subset1(p + ch, alpha.substring(1));

        ArrayList<String> right =  subset1(p,alpha.substring(1));
        left.addAll(right);
        return left;
    }
}
