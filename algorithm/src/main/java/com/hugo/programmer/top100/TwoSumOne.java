package com.hugo.programmer.top100;

public class TwoSumOne {
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

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}