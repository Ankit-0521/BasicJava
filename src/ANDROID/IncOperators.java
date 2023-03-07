package ANDROID;

public class IncOperators {
    public static void main(String[] args) {
        String[] operations = {"x++", " x--", "--x", "++x"};
        int p=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].contains("++"))
                p++;
            else if(operations[i].contains("--"))
                p--;
            else
                continue;
        }
        System.out.println(p);;
    }
}
