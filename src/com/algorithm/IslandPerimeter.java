package com.algorithm;

public class IslandPerimeter {

	// 463. Island Perimeter

	public static void main(String[] args) {
		// 先计算出1的数量，不算相邻情况下边的数量，再减去相邻的边
	}

	public static int islandPerimeter(int[][] grid) {

		int island = 0;
		int nonisland = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					island++;
					if (i + 1 < grid.length && grid[i + 1][j] == 1) {
						nonisland++;
					}
					if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
						nonisland++;
					}
				}
			}
		}

		return island * 4 - nonisland * 2;
	}
}
