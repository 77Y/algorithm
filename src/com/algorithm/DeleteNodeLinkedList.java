package com.algorithm;

public class DeleteNodeLinkedList {

	// 237. Delete Node in a Linked List
	// 这个有毛病。不是严格意义的删除，把当前节点的值改了（换成下一个），把下一个覆盖掉

	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		deleteNode(node2);

		ListNode node = node1;

		while (node.next != null) {
			node = node.next;
			System.err.println(node.val);
		}

	}

	public static void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;

	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
