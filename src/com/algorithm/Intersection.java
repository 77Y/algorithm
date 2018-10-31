package com.algorithm;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	// 349. Intersection of Two Arrays

	public static void main(String[] args) {

		int nums1[] = { 4, 9, 5 };
		int nums2[] = { 9, 4, 9, 8, 4 };

		int c[] = intersection(nums1, nums2);

		System.err.println(c.length);
	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> liSet = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					liSet.add(nums1[i]);
				}
			}
		}

		int a[] = new int[liSet.size()];

		Object u[] = liSet.toArray();

		for (int i = 0; i < u.length; i++) {
			a[i] = (int) u[i];
		}

		return a;
	}
}
