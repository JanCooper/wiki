package org.janco;

public class TwoSumBruteForce {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] nums1 = nums.clone();
        int[] nums2 = nums.clone();
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if(nums1[i] + nums2[j] == target) {
                    index1=i;
                    index2=j;
                }
            }
        }
        System.out.println(index1 + ", " + index2);
    }
}