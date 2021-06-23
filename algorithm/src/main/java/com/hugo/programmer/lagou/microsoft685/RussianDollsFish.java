package com.hugo.programmer.lagou.microsoft685;

import java.util.Stack;

/**
 * @author hugo0129
 * 俄罗斯套娃，大鱼吃小鱼
 * 【题目】在水中有许多鱼，可以认为这些鱼停放在 x 轴上。再给定两个数组 Size，Dir，Size[i] 表示第 i 条鱼的大小，Dir[i] 表示鱼的方向 （0 表示向左游，1 表示向右游）。这两个数组分别表示鱼的大小和游动的方向，并且两个数组的长度相等。鱼的行为符合以下几个条件:
 * 所有的鱼都同时开始游动，每次按照鱼的方向，都游动一个单位距离；
 * 当方向相对时，大鱼会吃掉小鱼；
 * 鱼的大小都不一样。
 * 输入：Size = [4, 2, 5, 3, 1], Dir = [1, 1, 0, 0, 0]
 * 输出：3
 */
public class RussianDollsFish {
    public int eatFish(int[] fishSize, int[] fishDirection) {
        /**
         * 1.边界判断
         */
        final int fishNumber = fishSize.length;
        if (fishNumber <= 1) {
            return fishNumber;
        }
        final int left = 0;
        final int right = 1;

        /**
         * 2.大鱼小鱼
         */
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < fishNumber; i++) {
            // 当前鱼的方向
            final int currFishDirection = fishDirection[i];
            // 当前鱼的大小
            final int currFishSize = fishSize[i];
            // 当前鱼是否会被吃掉
            boolean hasEat = false;
            // 如果栈顶鱼的方向是往右，当前鱼的方向往左
            while (!stack.empty()
                    && fishDirection[stack.peek()] == right
                    && currFishDirection == left) {
                // 如果栈顶鱼的大小大于当前鱼的大小，则当前鱼会被吃掉
                if (fishSize[stack.peek()] > currFishSize) {
                    hasEat = true;
                    break;
                }
                // 如果栈顶的鱼比较小，那么当前鱼会把栈顶的鱼吃掉
                stack.pop();
            }
            // 如果新来的鱼没有被吃掉，那么压入栈
            if (!hasEat) {
                stack.push(i);
            }
        }
        return stack.size();
    }

}
