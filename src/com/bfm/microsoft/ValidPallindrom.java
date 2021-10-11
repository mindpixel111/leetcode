package com.bfm.microsoft;

import java.awt.datatransfer.SystemFlavorMap;

public class ValidPallindrom {

    public boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while(start <= end){
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPallindrom sol = new ValidPallindrom();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
