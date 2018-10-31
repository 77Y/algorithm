package com.algorithm;

import java.util.Stack;

public class ReverseLinkedList {

	// 206 Reverse Linked List

	public static void main(String[] args) {

	}

	public ListNode reverseList(ListNode head) {

		Stack<ListNode> stack = new Stack<>();
		while (head.next != null) {
			stack.push(head);
		}

		ListNode newHead = stack.pop();

		while (!stack.isEmpty()) {
			newHead.next = stack.pop();
		}

		return newHead;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
