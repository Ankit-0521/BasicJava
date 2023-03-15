package DP;
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int leastprice = Integer.MAX_VALUE;
        int profit;
        int maxProfit = 0;
        int i;
        for (i = 0; i < prices.length; i++) {
            if (prices[i] < leastprice) {
                leastprice = prices[i];
            }
            profit = prices[i] - leastprice;
            if (profit > maxProfit) maxProfit = profit;

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] p = {7,1,5,3,6,4};
        MaxProfit m1 = new MaxProfit();
        int ans = m1.maxProfit(p);
        System.out.println(ans);
    }
}
