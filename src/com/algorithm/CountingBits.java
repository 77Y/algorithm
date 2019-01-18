package com.algorithm;

public class CountingBits {

	// 338. Counting Bits

	public static void main(String[] args) {

	}

	public static int[] countBits(int num) {

		int[] array = new int[num + 1];

		for (int i = 0; i <= num; i++) {

			int count = 0;
			int val = i;

			while (val != 0) {
				if ((val & 1) == 1) {
					count++;
				}
				val = val >> 1;
			}
			array[i] = count;

		}
		return array;
	}
}
