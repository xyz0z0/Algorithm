package com.company.leetcode125;

/**
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * <p>
 * 输入: "race a car"
 * 输出: false
 */
public class Solution {


    public static void main(String[] args) {
        String text1 = "A man, a plan, a canal: Panama";
        String text2 = "race a car";
        System.out.println(isPalindrome(text1));
        System.out.println(isPalindrome(text2));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.length() <= 1) {
            return true;
        }
        int x = 0;
        int y = s.length() - 1;
        for (int i = 0; i < s.length(); ) {
            if (x > y) {
                return true;
            }
            char a = s.charAt(i);
            char b = s.charAt(y);
            if (a >= 48 && a <= 57 || a >= 65 && a <= 90 || a >= 97 && a <= 122) {
                if (b >= 48 && b <= 57 || b >= 65 && b <= 90 || b >= 97 && b <= 122) {
                    if (a == b) {
                        i++;
                        y--;
                    } else {
                        return false;
                    }
                } else {
                    y--;
                }
            } else {
                i++;
            }
        }
        return true;
    }
}
