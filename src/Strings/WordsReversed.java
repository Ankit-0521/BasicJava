package Strings;

public class WordsReversed {
    public String wordReversed(String s){
        String[] sa= s.split(s);
        int i=0, j=sa.length-1; String temp;
        while (i<j){
            temp=sa[i];
            sa[i++]=sa[j];
            sa[j--]=temp;
        }
        String s2="";
        for (int k = 0; k < sa.length; k++) {
            s2= s2.concat(sa[k]);
            if (k<sa.length-1){
                s2=s2.concat(" ");
            }
        }
        return s2;
    }

    public static void main(String[] args) {
        String str = "My name is khan";
        WordsReversed wr = new WordsReversed();
        String s = wr.wordReversed(str);
        String s1 = wr.getWordReversed(str);
        System.out.println(s);
        System.out.println(str);
    }

    public String getWordReversed(String s){
        char[] ca = s.toCharArray();
        int i = 0, j=0, k; char temp;
        while (j<ca.length){
            while (ca[j]!=' ' && j<ca.length)j++;
            k=j-1;
            while (i<k){
                temp=ca[i];
                ca[i++]=ca[k];
                ca[k--]=temp;
            }
            j++;
            i=j;
        }
        return new String(ca);
    }
}
