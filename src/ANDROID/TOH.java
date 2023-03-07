package ANDROID;

public class TOH {
    public static void main(String[] args) {
        Toh('A','B','C',3);
    }
    static void Toh(char source, char aux, char destination, int num){
        if (num>0){
            Toh(source,destination,aux,num-1);
            System.out.println("Move disk from" + source + " to " +destination+ " using "+aux);
            Toh(aux,source,destination,num-1);
        }
    }
}
