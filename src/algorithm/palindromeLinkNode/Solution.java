package algorithm.palindromeLinkNode;

public class Solution {
	public static void main(String[] args) {
		ListNode node = buildNode();
		System.out.println(isPalindrome(node));
	}

	private static boolean isPalindrome(ListNode head) {
		if(head == null) {
			return false;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = slowPtr.next.next;
		}

		//reverse slowPtr
		ListNode preNode = null;
		ListNode currentNode = slowPtr;
		while (currentNode != null) {
			ListNode nextNode = currentNode.next;
			currentNode.next = preNode;
			preNode = currentNode;
			currentNode = nextNode;
		}

		//judge
		while(preNode != null) {
			if(head.val != preNode.val) {
				return false;
			}
			head = head.next;
			preNode = preNode.next;
		}
		return true;
	}

	private static ListNode buildNode() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node33 = new ListNode(3);
		ListNode node22 = new ListNode(2);
		ListNode node11 = new ListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node33;
		node33.next = node22;
		node22.next = node11;

		return node1;
	}
}
