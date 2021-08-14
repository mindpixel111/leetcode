package com.bfm.sde;

public class lc_557 {

    public String reverseWords(String s) {
        String ans = "";
        int i = 0;
        int j = 0;
        for(int k = 0; k < s.length();k++){
            if(s.charAt(k) == ' ' || k == s.length()-1){
                if( k == s.length()-1)
                    j = k+1;
                else
                    j = k;
                ans = ans + " " + reverse(s.substring(i,j));
                i = j+1;
            }
        }
        return ans.substring(0,ans.length()-1);
    }

    String reverse(String str){
        String s = "";
        for(int i=0;i<str.length();i++){
            s = str.charAt(i) + s;
        }
        return s;
    }

    public static void main(String[] args) {
        lc_557 sol = new lc_557();
        sol.reverseWords("Let's take LeetCode contest");
    }
}
