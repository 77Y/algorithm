package com.algorithm;

public class MergeTwoSortedLists {

	// 21 Merge Two Sorted Lists
	// 递归
	public static void main(String[] args) {

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}
		if (l1.val >= l2.val) {
			ListNode node = l2;
			node.next = mergeTwoLists(l1, l2.next);
			return node;
		} else {
			ListNode node = l1;
			node.next = mergeTwoLists(l1.next, l2);
			return node;
		}

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
