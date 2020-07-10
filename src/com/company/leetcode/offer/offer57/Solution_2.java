package com.company.leetcode.offer.offer57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_2 {


    public static void main(String[] args) {
        int[][] ints = findContinuousSequence(9);
        System.out.println(Arrays.deepToString(ints));
    }

    public static int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j = j + 1;
            } else if (sum > target) {
                sum -= i;
                i = i + 1;
            } else {
                int[] ints = new int[j - i];
                for (int k = i; k < j; k++) {
                    ints[k - i] = k;
                }
                res.add(ints);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}