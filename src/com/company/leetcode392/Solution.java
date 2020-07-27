package com.company.leetcode392;

public class Solution {

    public static void main(String[] args) {
        //""
        //"ahbgdc"
        String s = "";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        int j = 0;
        for (char c : charsT) {
            if (c == charsS[j]) {
                j++;
                if (j == charsS.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
