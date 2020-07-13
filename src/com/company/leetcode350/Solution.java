package com.company.leetcode350;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
//        int[] nums1 = new int[]{1, 2, 2, 1};
//        int[] nums2 = new int[]{2}; // -- 2
        int[] nums1 = new int[]{3, 1, 2};
        int[] nums2 = new int[]{1, 1};// -- 1
//        int[] nums1 = new int[]{4, 9, 5};
//        int[] nums2 = new int[]{9, 4, 9, 8, 4};// -- 4 9
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    //执行用时：
    //5 ms
    //, 在所有 Java 提交中击败了
    //31.23%
    //的用户
    //内存消耗：
    //39.9 MB
    //, 在所有 Java 提交中击败了
    //5.13%
    //的用户
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int num1 = map.getOrDefault(i, 0);
            map.put(i, num1 + 1);
        }
        List<Integer> integers = new ArrayList<>();
        for (int j : nums2) {
            int num2 = map.getOrDefault(j, 0);
            if (num2 != 0) {
                integers.add(j);
                map.put(j, num2 - 1);
            }
        }
        int[] array = new int[integers.size()];
        for (int k = 0; k < integers.size(); k++) {
            array[k] = integers.get(k);
        }
        return array;
    }

}
