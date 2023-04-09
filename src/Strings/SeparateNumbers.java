package Strings;
//A numeric string, , is beautiful if it can be split into a sequence of two or more positive integers, , satisfying the following conditions:
//
// for any  (i.e., each element in the sequence is  more than the previous element).
//No  contains a leading zero. For example, we can split  into the sequence , but it is not beautiful because  and  have leading zeroes.
//The contents of the sequence cannot be rearranged. For example, we can split  into the sequence , but it is not beautiful because it breaks our first constraint (i.e., ).
//The diagram below depicts some beautiful strings:
//
//image
//
//Perform  queries where each query consists of some integer string . For each query, print whether or not the string is beautiful on a new line.
// If it is beautiful, print YES x, where  is the first number of the increasing sequence. If there are multiple such values of , choose the smallest. Otherwise, print NO.
public class SeparateNumbers {
    public void separateNumbers(String s) {
        long a = checked(s);
        if(a!=-1){
            System.out.println("YES "+a);
        }else{
            System.out.println("NO");
        }

    }
    public long checked(String s){
        for(int j =1; j<s.length()+1 && j<18; j++){ //  how many digits is considered
            long a = Long.parseLong(s.substring(0,j)); // converting into long
            long in = a;
            String temp=""+a; // converting into String
            int count = 1;
            while(temp.length()<s.length()){
                a++;
                count++;
                temp+=a;
            }
            if(temp.equals(s) && count>=2){
                return in;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "91011";
        String s1 = "101103";
        SeparateNumbers sp = new SeparateNumbers();
        sp.separateNumbers(s);
        sp.separateNumbers(s1);
    }
}
