package com.algorithm;

public class SingleNumber {
	// 136 Single Number

	public static void main(String[] args) {

	}

	// 两个相同的数异或后为0；
	// 0和一个数异或后为那个数；
	// 异或运算满足交换律。

	public static int singleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}

	// public static int singleNumber(int[] nums) {
	//
	// if (nums.length == 1) {
	// return nums[0];
	// }
	// Arrays.sort(nums);
	//
	// if (nums[0] != nums[1]) {
	// return nums[0];
	// }
	//
	// if (nums[nums.length - 2] != nums[nums.length - 1]) {
	// return nums[nums.length - 1];
	// }
	//
	// for (int i = 1; i < nums.length - 3; i++) {
	// if (nums[i] != nums[i + 1] && nums[i + 1] != nums[i + 2]) {
	// return nums[i + 1];
	// }
	// }
	// return 0;
	// }

	// 参考https://blog.csdn.net/cloudox_/article/details/52459584
}
