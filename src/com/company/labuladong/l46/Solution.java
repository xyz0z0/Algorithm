package com.company.labuladong.l46;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(permute(arr));
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track, res);
        return res;
    }

    private static void backtrack(int[] nums, LinkedList<Integer> track, List<List<Integer>> res) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<Integer>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            backtrack(nums, track, res);
            track.removeLast();
        }
    }

}
