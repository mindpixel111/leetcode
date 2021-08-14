package com.bfm.coda;

public class lc_322_recursive {

    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int i=0;i<=amount;i++)
            dp[0][i] = Integer.MAX_VALUE-1;
        for(int i = 1;i<= coins.length;i++)
            dp[i][0] = 0;
        int x = solve(coins,coins.length,amount,dp);
        if(x == Integer.MAX_VALUE-1)
            return -1;
        return x;
    }

    public int solve(int[] coins, int n, int amount, int[][] dp){
        if(amount < 0)
            return Integer.MAX_VALUE-1;

        if (amount == 0)
            return 0;

        if(dp[n][amount] != 0)
            return dp[n][amount];

        if(coins[n-1] <= amount){
            dp[n][amount] = Math.min(1 + solve(coins,n,amount - coins[n-1],dp),solve(coins,n-1,amount,dp));
        }else{
            dp[n][amount] = solve(coins,n-1,amount,dp);
        }
        return dp[n][amount];
    }

    public static void main(String[] args) {
        lc_322_recursive sol = new lc_322_recursive();
        int[] coins = {1,2,5};

        sol.coinChange(coins,11);
    }
}
