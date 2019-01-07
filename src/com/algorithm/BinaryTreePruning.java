package com.algorithm;

public class BinaryTreePruning {

	public TreeNode pruneTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode l = pruneTree(root.left);
		TreeNode r = pruneTree(root.right);
		root.left = l;
		root.right = r;
		if (l == null && r == null && root.val == 0)
			return null;
		return root;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}
}
