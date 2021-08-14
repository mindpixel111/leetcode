package com.bfm.coda;

import java.util.Arrays;

public class lc_300 {

    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int max = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    if(dp[i] > max)
                        max = dp[i];
                }
            }
        if(max == Integer.MIN_VALUE)
            return 1;
        return max;
    }

    public static void main(String[] args) {
        lc_300 sol = new lc_300();
        int nums[] = {0,1,0,3,2,3};
        sol.lengthOfLIS(nums);
    }
}
