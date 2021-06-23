package com.hugo.programmer.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

public class TowSumTwo {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);

        int[] nums1 = new int[]{3, 2, 4};
        int target1 = 6;
        twoSum(nums1, target1);

        int[] nums2 = new int[]{3, 3};
        int target2 = 6;
        twoSum(nums2, target2);
    }


    /**
     * two sum 哈希表
     * 空间复杂度：O(N)
     * 时间复杂度：O(N)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        /**
         * key：存放遍历的数值
         * value: 存放索引值
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (map.containsKey(target - nums[i])) {
                System.out.println("[" + i + "," + map.get(target - nums[i]) + "]");
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
