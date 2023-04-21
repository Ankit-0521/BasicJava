package ANDROID;
//There is a group of n members, and a list of various crimes they could commit. The ith crime generates a profit[i] and
// requires group[i] members to participate in it. If a member participates in one crime, that member can't participate
// in another crime.
//
//Let's call a profitable scheme any subset of these crimes that generates at least minProfit profit, and the total
// number of members participating in that subset of crimes is at most n.
//
//Return the number of schemes that can be chosen. Since the answer may be very large, return it modulo 10^9 + 7.

public class ProfitableSchemes {
    int mod = 1000000007;

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int dp[][] = new int[n + 1][minProfit + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= group.length; i++) {
            int g = group[i - 1];
            int p = profit[i - 1];
            for (int j = n; j >= g; j-- ) {
                for (int k = minProfit; k >= 0; k--) {
                    dp[j][k] = (dp[j][k] + dp[j - g][Math.max(0, k - p)]) % mod;
                }
            }

        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = (sum + dp[i][minProfit])%mod;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] group = {2,3,5};
        int[] profit = {6,7,8};
        ProfitableSchemes ps = new ProfitableSchemes();
        System.out.println(ps.profitableSchemes(10,5,group,profit));
    }
}
