package algorithm.circleLinkNode;

public class Solution {
	public static void main(String[] args) {
		ListNode node = buildNode();
		System.out.println(hasCircle(node));
	}

	private static boolean hasCircle(ListNode node) {
		if(node == null) {
			return false;
		}
		ListNode slowPointer = node;
		ListNode fastPointer = node;
		while(fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer.val == fastPointer.val) {
				return true;
			}
		}
		return false;
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
		node9.next = node5;

		return node1;
	}
}
