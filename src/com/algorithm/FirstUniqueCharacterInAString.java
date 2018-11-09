package com.algorithm;

public class FirstUniqueCharacterInAString {

	// 387 First Unique Character In A String

	public static void main(String[] args) {

	}

	public int firstUniqChar(String s) {
		if (s == null || s.equals("")) {
			return -1;
		}
		char[] list = s.toCharArray();
		int[] result = new int[26];

		for (int i = 0; i < list.length; i++) {
			int a = list[i] - 'a';
			result[a]++;
		}

		for (int i = 0; i < list.length; i++) {
			int a = list[i] - 'a';
			if (result[a] == 1) {
				return i;
			}
		}

		return -1;
	}
}
