package com.hugo.programmer.lagou.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author hugo0129
 * https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self/
 * 给定一个整数数组 nums，按要求返回一个新数组counts。数组 counts 有该性质： counts[i] 的值是 nums[i] 右侧小于nums[i] 的元素的数量。
 * 输入：nums = [5,2,6,1]
 * 输出：[2,1,1,0]
 * 解释：
 * 5 的右侧有 2 个更小的元素 (2 和 1)
 * 2 的右侧仅有 1 个更小的元素 (1)
 * 6 的右侧有 1 个更小的元素 (1)
 * 1 的右侧有 0 个更小的元素
 */
public class CountOfSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        CountOfSmallerNumbersAfterSelf afterSelf = new CountOfSmallerNumbersAfterSelf();
        int[] nums = {5, 2, 6, 1};
        List<Integer> integers = afterSelf.countSmaller(nums);
        for (Integer integer : integers) {
            System.out.println("===" + integer);
        }
    }

    /**
     * 双重循环，时间复杂度高，超出时间限制
     *
     * @param nums
     * @return
     */
    public List<Integer> countSmaller(int[] nums) {
        /**
         * 存放比i小的个数
         */
        Integer[] ans = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            /**
             * 当前元素值
             */
            final int curr = nums[i];
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < curr) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return Arrays.asList(ans);
    }
}
