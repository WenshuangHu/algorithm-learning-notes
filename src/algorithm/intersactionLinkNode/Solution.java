package algorithm.intersactionLinkNode;

import java.util.List;

public class Solution {
	public static void main(String[] args) {
		ListNode[] nodes = buildNode();
		System.out.println(getIntersection(nodes[0], nodes[1]).val);
	}

	private static ListNode getIntersection(ListNode head1, ListNode head2) {
		if(head1 == null || head2 == null) {
			return null;
		}

		ListNode node1 = head1;
		ListNode node2 = head2;
		while(node1.val != node2.val) {
			node1 = node1.next == null ? head2 : node1.next;
			node2 = node2.next == null ? head1 : node2.next;
		}

		return node1;
	}

	private static ListNode[] buildNode() {
		ListNode head1 = new ListNode(1);
		ListNode node3 = new ListNode(3);
		ListNode node5 = new ListNode(5);
		ListNode node7 = new ListNode(7);
		ListNode node9 = new ListNode(9);
		head1.next = node3;
		node3.next = node5;
		node5.next = node7;
		node7.next = node9;

		ListNode head2 = new ListNode(2);
		head2.next = node5;

		return new ListNode[]{head1, head2};
	}
}
