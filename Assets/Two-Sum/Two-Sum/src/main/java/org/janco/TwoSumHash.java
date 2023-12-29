package org.janco;

import java.util.HashMap;

public class TwoSumHash {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int sum = target - nums[i];
            if(numsMap.containsKey(sum)){
                System.out.println(i +  " , " + numsMap.get(sum));
                break;
            }
        }
    }
}