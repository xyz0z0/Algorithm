package com.company.leetcode35;


class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 3, 4, 4, 5};
        System.out.println(searchInsert(array, 1));
    }

//    public static int searchInsert(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= target) {
//                return i;
//            }
//        }
//        return nums.length;
//    }

    // 作者：LeetCode-Solution
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) / 2) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
