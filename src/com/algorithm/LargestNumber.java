package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {

		// int[] arg = { 824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247 };

		// int[] arg = { 8247,824 };
		// int[] arg = { 3, 30, 34, 5, 9 };
		// int[] arg = { 3, 30};

		// int[] arg = { 1, 1, 1 };
		// int[] arg = { 121,12};
		int[] arg = { 2, 2281 };

		// 12112
		// 12121
		System.err.println(largestNumber(arg));

		// "9534330"
	}

	public static String largestNumber(int[] nums) {

		if (nums.length == 0) {
			return "";
		}
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
			sum += nums[i];
		}

		if (sum == 0) {
			return "0";
		}

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {

				String s1 = String.valueOf(i1);
				String s2 = String.valueOf(i2);

				return (s1 + s2).compareTo(s2 + s1);

			}
		});

		String result = "";
		for (int i = list.size() - 1; i >= 0; i--) {
			result += list.get(i);
		}

		return result;
	}
}
