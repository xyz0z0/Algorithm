package com.company.leetcode167;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[]{2,3,5,7,9};
        System.out.println(Arrays.toString(twoSum(numbers, 8)));
    }

    public static int[] twoSum(int[] numbers, int target) {


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] < target) {
                    continue;
                } else if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                } else {
                    break;
                }
            }
        }
        return null;
    }
}
