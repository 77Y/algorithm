package com.algorithm;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {

	// 747. Largest Number At Least Twice of Others

	public static void main(String[] args) {

		int[] a = { 1, 0 };

		System.out.println(dominantIndex(a));
	}

	public static int dominantIndex(int[] nums) {

		if (nums.length < 1) {
			return -1;
		}

		if (nums.length == 1) {

			return 0;
		}

		int[] nums1 = Arrays.copyOf(nums, nums.length);

		Arrays.sort(nums);

		if (nums[nums.length - 1] >= nums[nums.length - 2] * 2) {

			for (int i = 0; i < nums1.length; i++) {
				if (nums1[i] == nums[nums.length - 1]) {
					return i;
				}
			}
		}

		return -1;
	}
}
