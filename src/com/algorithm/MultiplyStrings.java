package com.algorithm;

import java.math.BigDecimal;

public class MultiplyStrings {

	// 43. Multiply Strings

	public static void main(String[] args) {

	}

	public String multiply(String num1, String num2) {
		BigDecimal b1 = new BigDecimal(num1);
		BigDecimal b2 = new BigDecimal(num2);

		return b1.multiply(b2).toString();
	}
}
