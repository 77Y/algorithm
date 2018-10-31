package com.algorithm;

public class CountPrimes {

	// 204. Count Primes

	public static void main(String[] args) {

		System.err.println(countPrimes(4));

		// System.err.println(isPrime(2));

		// System.err.println(isPrime(4));

		// https://baike.baidu.com/item/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95
		// 埃拉托斯特尼筛法，简称埃氏筛或爱氏筛，是一种由希腊数学家埃拉托斯特尼所提出的一种简单检定素数的算法。
		// 要得到自然数n以内的全部素数，必须把不大于根号n的所有素数的倍数剔除，剩下的就是素数。
	}

	public static int countPrimes(int n) {

		if (n <= 1) {
			return 0;
		}

		int count = 0;

		boolean[] flags = new boolean[n];
		flags[0] = true;
		flags[1] = true;

		for (int i = 2; i * i <= n; i++) {
			if (!flags[i]) {
				for (int j = i * 2; j < n; j = j + i) {
					flags[j] = true;
				}
			}

		}

		for (boolean b : flags) {
			if (!b) {
				count++;
			}
		}
		return count;
	}

	// public static int countPrimes(int n) {
	//
	// int count = 0;
	// if (n <= 1) {
	// return count;
	// }
	//
	// for (int i = 2; i < n; i++) {
	// if (isPrime(i)) {
	// count++;
	// }
	// }
	// return count;
	// }
	//
	// public static boolean isPrime(int number) {
	//
	// for (int i = 2; i <= Math.sqrt(number); i++) {
	//
	// if (number % i == 0) {
	//
	// return false;
	// }
	// }
	//
	// return true;
	// }

}
