package com.algorithm;

public class ContainsDuplicate {

	// 217. Contains Duplicate

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 1 };
		System.out.println(containsDuplicate(a));
	}

	public static boolean containsDuplicate(int[] nums) {

		if (nums.length < 1) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;

				}
			}
		}

		return false;

	}
}
