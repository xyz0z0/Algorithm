package com.company.leetcode167;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[]{2,3,5,7,9};
        System.out.println(Arrays.toString(twoSum1(numbers, 8)));
    }

    public static int[] twoSum1(int[] numbers,int target){
        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    // 暴力解法 --！
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
