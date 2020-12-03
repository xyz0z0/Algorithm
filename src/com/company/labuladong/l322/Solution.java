package com.company.labuladong.l322;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(arr, amount));
    }

    public static int helper(Map<Integer, Integer> map, int[] coins, int amount) {
        if (map.get(amount) != null) {
            return map.get(amount);
        }
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = helper(map, coins, amount - coin);
            if (sub == -1) {
                continue;
            }
            res = Math.min(res, 1 + sub);
        }
        if (res != Integer.MAX_VALUE) {
            map.put(amount, res);
        } else {
            map.put(amount, -1);
        }
        return map.get(amount);
    }

    public static int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> map = new HashMap<>();
        return helper(map, coins, amount);
    }


}
