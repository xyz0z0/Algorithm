package com.company.leetcode27;

import java.util.Arrays;

/***
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 给定 nums = [3,2,2,3], val = 3,
 *
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 */
class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(array, 2));
        System.out.println(Arrays.toString(array));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == val) {
                j++;
            } else {
                if (i != j) {
                    nums[i] = nums[j];
                }
                i++;
                j++;
            }
        }
        return i ;
    }
}

//public int removeElement(int[] nums, int val) {
//    int i = 0;
//    for (int j = 0; j < nums.length; j++) {
//        if (nums[j] != val) {
//            nums[i] = nums[j];
//            i++;
//        }
//    }
//    return i;
//}
//
//作者：LeetCode
//链接：https://leetcode-cn.com/problems/remove-element/solution/yi-chu-yuan-su-by-leetcode/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。