package com.company.leetcode.offer;


import java.util.Arrays;

/**
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class Offer05 {

    public static void main(String[] args) {

        String test = " fds fdsfd 房贷首付发都是";
        System.out.println(test(test));
    }

    public static String test(String s) {
        if (s.length() == 0) {
            return s;
        }
        StringBuilder stringBuffer = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }
}
