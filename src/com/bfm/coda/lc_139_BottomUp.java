package com.bfm.coda;

import java.util.ArrayList;
import java.util.List;

public class lc_139_BottomUp {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[][] = new boolean[s.length()+1][s.length()+1];
        for(int i=0;i<=s.length();i++) {
            dp[i][0] = true;
            dp[0][i] = true;

            if(i < s.length() && wordDict.contains(s.charAt(i)))
                dp[i][i] = true;
            else
                dp[i][i] = false;
        }

        for(int i=1;i<=s.length();i++){
            for(int j = i;j<=s.length();j++){
                if(wordDict.contains(s.substring(i,j+1))){
                    dp[i][j] = true;
                }else{
                    for(int k=i;k<j;k++){
                        if(dp[i][k] && dp[k][j]){
                            dp[i][j] = true;
                            break;
                        }
                    }
                }
            }
        }
        return dp[s.length()+1][s.length()+1];
     }

    public static void main(String[] args) {
        lc_139_BottomUp sol = new lc_139_BottomUp();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("aaaa");
        wordDict.add("aaa");

        sol.wordBreak("aaaaaaa",wordDict);
    }
}
