package com.algorithm;

public class SearchInsertPosition {

	
//	35	Search Insert Position
	// 二分查找
	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5, 6 };

		System.out.println(searchInsert(a, 3));
	}

	public static int searchInsert(int[] nums, int target) {

		if (nums.length == 0) {
			return 0;
		}

		int low = 0;
		int hight = nums.length - 1;
		int middle = (low + hight) / 2;

		while (low <= hight) {
			if (target == nums[middle]) {
				return middle;
			} else if (target < nums[middle]) {
				hight = middle - 1;
				middle = (low + hight) / 2;
			} else {
				low = middle + 1;
				middle = (low + hight) / 2;
			}
		}

		return low;
	}
}
