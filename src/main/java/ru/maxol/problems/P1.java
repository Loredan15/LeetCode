package ru.maxol.problems;

/***
 * 1. Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class P1 {
    public static int[] twoSum(int[] nums, int target) {
        boolean resultIsFind = false;
        int countIndex = 0;
        int[] result = new int[2];
        while (countIndex < nums.length && !resultIsFind) {
            int a = nums[countIndex];
            for (int i = 0; i < nums.length; i++) {
                if (countIndex == i) continue;
                int num = nums[i];
                if (a + num == target) {
                    result[0] = countIndex;
                    result[1] = i;
                    resultIsFind = true;
                }
            }
            countIndex++;
        }
        return result;
    }
}

//    public static int[] twoSum(int[] nums, int target) {
//        int n=nums.length;
//        Map<Integer,Integer> map=new HashMap<>();
//        int[] result=new int[2];
//        for(int i=0;i<n;i++){
//            if(map.containsKey(target-nums[i])){
//                result[1]=i;
//                result[0]=map.get(target-nums[i]);
//                return result;
//            }
//            map.put(nums[i],i);
//        }
//        return result;
//    }
//}
