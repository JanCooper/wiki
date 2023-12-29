package org.janco;

import java.util.Arrays;

public class SortedTwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        Arrays.sort(nums);
        int target = 9;

        int leftIndex = 0;
        int rightIndex = nums.length -1;
        int left = nums[leftIndex];
        int right = nums[rightIndex];
        int sum = 0;

        while(sum != target){
            sum = left + right;

            if (sum < target){
                leftIndex++;
            } else if (sum > target){
                rightIndex--;
            }
        }
        System.out.println(leftIndex + ", " + rightIndex);
    }
}