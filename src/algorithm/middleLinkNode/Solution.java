package algorithm.middleLinkNode;

public class Solution {
	public static void main(String[] args) {
		ListNode node = buildNode();
		System.out.println(findMiddleNode(node).val);
	}

	private static ListNode findMiddleNode(ListNode node) {
		if(node == null) {
			throw new IllegalArgumentException("input is null.");
		}
		ListNode slowPointer = node;
		ListNode fastPointer = node;
		while(fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
	}

	private static ListNode buildNode() {
		ListNode node1 = new ListNode(1);
		ListNode node3 = new ListNode(3);
		ListNode node5 = new ListNode(5);
		ListNode node7 = new ListNode(7);
		ListNode node9 = new ListNode(9);
		node1.next = node3;
		node3.next = node5;
		node5.next = node7;
		node7.next = node9;

		return node1;
	}
}
