package com.hugo.programmer.lagou.microsoft685;

import java.util.Stack;

/**
 * @author hugo0129
 * 找出数组中右边比我小的元素
 * 【题目】一个整数数组 A，找到每个元素：右边第一个比我小的下标位置，没有则用 -1 表示。
 * 输入：[5, 2]
 * 输出：[1, -1]
 */
public class FindRightSmall {
    public int[] findRightSmall(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> indexStack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            final int x = A[i];
            while (!indexStack.empty() && A[indexStack.peek()] > x) {
                ans[indexStack.peek()] = i;
                indexStack.pop();
            }
            indexStack.push(i);
        }
        while (!indexStack.empty()) {
            ans[indexStack.peek()] = -1;
            indexStack.pop();
        }
        return ans;
    }
}
