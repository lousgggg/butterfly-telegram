package com.luo.wiley.springbootdemo.util;

import java.util.HashMap;

public class TwoNumber {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("两个数的下标为：" + i + "," + j);
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("不存在和为" + target + "的两个数！！");
        return null;
    }

}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(target-nums[i])){
                indexs[0] = hash.get(target-nums[i]);
                indexs[1] = i;
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(nums[i],i);
        }
        return indexs;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 5, 5, 7, 9, 11}, 11);
        System.out.println(ints[0] +"   "+ ints[1]);
    }
}

