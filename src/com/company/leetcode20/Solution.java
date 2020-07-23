package com.company.leetcode20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

class Solution {

    public static void main(String[] args) {
        System.out.println(isValid("]]]"));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character temp = stack.pop();
                if (c == ')' && temp != '(') {
                    return false;
                }
                if (c == ']' && temp != '[') {
                    return false;
                }
                if (c == '}' && temp != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
}