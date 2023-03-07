package ANDROID;
public class maxwealth {
    public static void main(String[] args) {
        int[][] wealth = {{1,2,3},{4,5,6},{7,8,9}};
        int ans=maximumWealth(wealth);
        System.out.println(ans);
    }


    static int maximumWealth(int[][] accounts) {
        int maxwealth =0;
        for(int[] amt: accounts){
            int wealth = 0;
            for(int element: amt){
                wealth += element;
            }
            if(wealth>maxwealth){
                maxwealth=wealth;
            }

        }
        return maxwealth;
    }
}