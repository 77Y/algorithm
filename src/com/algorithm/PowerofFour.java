package com.algorithm;

public class PowerofFour {

	// 342. Power of Four

	public static void main(String[] args) {

		System.err.println(isPowerOfFour(5));
	}

	public static boolean isPowerOfFour(int num) {

		int tmp = num - 1;
		return (num & tmp) == 0 && tmp % 3 == 0;
	}
}
