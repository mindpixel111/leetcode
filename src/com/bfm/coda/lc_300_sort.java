package com.bfm.coda;

import java.util.Arrays;

public class lc_300_sort {
    int max = 0;
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            arr[i] = nums[i];
        Arrays.sort(arr);
        int dp[][] = new int[nums.length+1][nums.length+1];
       solve(nums,arr,nums.length,nums.length,dp);
        return max;
    }

    public int solve(int[] arr1, int[] arr2, int i, int j, int[][] dp){
        if(i == 0 || j == 0)
            return 0;

        if(dp[i][j] != 0)
            return dp[i][j];

        if(arr1[i-1] == arr2[j-1])
            dp[i][j] = 1 + solve(arr1,arr2,i-1,j-1,dp);
        else
            dp[i][j] = Math.max(solve(arr1,arr2,i-1,j,dp),solve(arr1,arr2,i,j-1,dp));

        if(dp[i][j] > max)
            max = dp[i][j];

        return dp[i][j];
    }

    public static void main(String[] args) {
        lc_300_sort sol = new lc_300_sort();
        int[] nums = {10,9,2,5,3,7,101,18};
        sol.lengthOfLIS(nums);
    }

}
