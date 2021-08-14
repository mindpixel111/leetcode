package com.bfm.coda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_139_TopDown {

    List<String> dict;
    int[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        this.dict = wordDict;
        dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return solve(s,0);
    }

    public boolean solve(String s, int n){
        if(n == s.length())
            return true;

        if(dp[n] != -1)
            return dp[n] == 1 ? true : false;
        dp[n] = 0;
        for(int i=n;i<s.length();i++){
            String sub = s.substring(n,i+1);
            if(dict.contains(sub) && solve(s,i+1)){
                dp[n] = 1;
                return true;
            }
        }
        return dp[n] == 1 ? true:false;
    }

    public static void main(String[] args) {
        lc_139_TopDown sol = new lc_139_TopDown();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("aaaa");
        wordDict.add("aaa");

        sol.wordBreak("aaaaaaa",wordDict);
    }
}
