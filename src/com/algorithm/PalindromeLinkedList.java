package com.algorithm;

import java.util.Stack;

public class PalindromeLinkedList {

	// 234 Palindrome Linked List

	public static void main(String[] args) {

		ListNode node = new ListNode(1);
		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(0);

		node.next = node1;
		node1.next = node2;

		isPalindrome(node);

	}

	public static boolean isPalindrome(ListNode head) {

		if (head == null || head.next == null) {
			return true;
		}

		Stack<ListNode> nodes = new Stack<>();

		int len = 0;
		while (head != null) {
			nodes.push(head);
			head = head.next;
			len++;
		}

		Stack<ListNode> nodes2 = new Stack<>();

		for (int i = 0; i < len / 2; i++) {
			nodes2.push(nodes.pop());
		}

		if (len % 2 != 0) {
			nodes.pop();
		}

		while (!nodes.isEmpty()) {
			ListNode node = nodes.pop();
			ListNode node2 = nodes2.pop();
			if (node.val != node2.val) {
				return false;
			}

		}

		return true;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
