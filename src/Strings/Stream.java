package Strings;
// stream of characters
public class Stream {
    public static void main(String[] args) {

        System.out.println(skipAppNotApple("bacappecdah"));
        skip("a","bacappecdah");
        System.out.println(skip2("bacappecdah"));

    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return"";
        }



        if (up.startsWith("app") && !up.startsWith("apple")){
         return skipAppNotApple(up.substring(3));
        }
        else {
           return up.charAt(0)+ skipAppNotApple(up.substring(1));
        }
    }

    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
           return skip2(up.substring(1));
        }
        else {
            return ch + skip2(up.substring(1));
        }
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }

}
