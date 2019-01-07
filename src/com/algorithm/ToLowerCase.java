package com.algorithm;

public class ToLowerCase {

	public static void main(String[] args) {

	}

	public String toLowerCase(String str) {
		char[] array = str.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 'A' && array[i] <= 'Z') {
				array[i] += 32;
			}
		}

		return new String(array);
	}
}
