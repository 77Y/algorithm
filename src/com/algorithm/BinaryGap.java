package com.algorithm;

public class BinaryGap {
	// 868. Binary Gap

	public static void main(String[] args) {

		System.err.println(binaryGap(5));
	}

	public static int binaryGap(int N) {

		int[] arr = new int[32];
		int count1 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (((N >> i) & 1) == 1) {
				arr[count1++] = i;
			}
		}

		int distance = 0;

		for (int i = 0; i < count1; i++) {
			distance = Math.max(arr[i + 1] - arr[i], distance);
		}

		return distance;
	}
}
