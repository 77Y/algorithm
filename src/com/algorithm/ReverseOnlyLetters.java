package com.algorithm;

public class ReverseOnlyLetters {

	// 917. Reverse Only Letters

	public static void main(String[] args) {

	}

	public String reverseOnlyLetters(String S) {

		int begin = 0;
		int end = S.length() - 1;
		char[] result = S.toCharArray();

		while (begin < end) {

			boolean isBeginLatter = Character.isLetter(result[begin]);
			boolean isEndLatter = Character.isLetter(result[end]);

			char beginChar = result[begin];
			char endChar = result[end];
			if (isBeginLatter && isEndLatter) {
				result[end] = beginChar;
				end--;
				result[begin] = endChar;
				begin++;
			} else if (isBeginLatter && !isEndLatter) {
				end--;
			} else if (!isBeginLatter && isEndLatter) {
				begin++;
			} else {
				begin++;
				end--;
			}
		}

		return String.valueOf(result);
	}
}
