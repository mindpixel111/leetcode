package com.bfm.coda;

import java.util.Arrays;

public class lc_322 {

    public int coinChange(int[] coins, int amount) {
        int[] prev = new int[amount+1];
        int[] curr = new int[amount+1];

        for(int j=0;j<=amount;j++){
            prev[j] = Integer.MAX_VALUE-1;
        }

        for(int i = 1;i<= coins.length;i++){
            for(int j=1;j<= amount;j++){
                if(coins[i-1] <= j){
                    curr[j] = Math.min(1 + curr[j-coins[i-1]],prev[j]);
                }else{
                    curr[j] = prev[j];
                }
            }
            for(int k=0;k<prev.length;k++)
                prev[k] = curr[k];
        }
        if(curr[amount] == Integer.MAX_VALUE-1)
            return -1;
        return curr[amount];
    }

    public static void main(String[] args) {
        lc_322 sol = new lc_322();
        int[] coins = {1,2,5};
        sol.coinChange(coins,11);

    }
}
