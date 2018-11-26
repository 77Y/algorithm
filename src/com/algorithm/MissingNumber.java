package com.algorithm;

public class MissingNumber {

	// 268. Missing Number
	public static void main(String[] args) {
		// 等差数列求和做减法
	}

	public int missingNumber(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int sumReal = (0 + nums.length) * nums.length / 2;

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sumReal - sum;
	}
}
