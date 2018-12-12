package com.algorithm;

public class ValidPerfectSquare {

	// 367 Valid Perfect Square
	public static void main(String[] args) {

	}

	public boolean isPerfectSquare(int num) {

		if (num < 0) {
			return false;
		}
		if (num == 1) {
			return true;
		}
		for (int i = 1; i <= num / i; i++) {
			if (i * i == num)
				return true;
		}
		return false;
	}

	// public boolean isPerfectSquare(int num) {
	//
	// if (num == 1) {
	// return true;
	// }
	//
	// int low = 1;
	// int high = num;
	//
	// while (low < high) {
	// int middle = (low + high) / 2;
	// if (middle * middle == num) {
	// return true;
	// } else if (middle * middle > num) {
	// high = middle - 1;
	// } else {
	// low = middle + 1;
	// }
	// }
	//
	// return false;
	// }
}
