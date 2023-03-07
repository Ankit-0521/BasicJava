public class NewClass {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        int i =0;
        for( i = 1;i<=n; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i%j) == 0) {
                    count++;
                }
            }
        }

    }
}
