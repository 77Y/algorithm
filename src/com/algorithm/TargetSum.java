package com.algorithm;

public class TargetSum {
	// https://kingsfish.github.io/2017/08/22/Leetcode-494-Target-Sum/
	// https://blog.csdn.net/JackZhang_123/article/details/78793365
	// https://blog.csdn.net/rjx_1996/article/details/78237090

	public static void main(String[] args) {

		
		System.out.println("sss".equals(null));
		
		int[] a = { 1, 1, 1, 1, 1 };

		System.err.println(findTargetSumWays(a, 3));
	}

	public static int findTargetSumWays(int[] nums, int S) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		if (S > sum || (S + sum) % 2 != 0) {
			return 0;
		}
		sum = (S + sum) / 2;
		int[] dp = new int[sum + 1];
		dp[0] = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = sum; j >= nums[i]; j--) {
				dp[j] += dp[j - nums[i]];
			}
		}
		return dp[sum];
	}
}
