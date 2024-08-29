package algorithm.mergetwosortedlists;

public class Solution {
	public static void main(String[] args) {
		ListNode node1 = buildNode1();
		ListNode node2 = buildNode2();
		ListNode result = merge(node1, node2);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	private static ListNode merge(ListNode node1, ListNode node2) {
		ListNode node = new ListNode(0);
		ListNode head = node;
		while (node1 != null && node2 != null) {
			if(node1.val <= node2.val) {
				node.next = node1;
				node1 = node1.next;
			} else {
				node.next = node2;
				node2 = node2.next;
			}
			node = node.next;
		}
		if(node1 != null) {
			node.next = node1;
		} else if (node2 != null) {
			node.next = node2;
		}

		return head.next;
	}

	private static ListNode buildNode1() {
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

	private static ListNode buildNode2() {
		ListNode node2 = new ListNode(2);
		ListNode node4 = new ListNode(4);
		ListNode node6 = new ListNode(6);
		ListNode node8 = new ListNode(8);
		ListNode node10 = new ListNode(10);
		ListNode node12 = new ListNode(12);
		node2.next = node4;
		node4.next = node6;
		node6.next = node8;
		node8.next = node10;
		node10.next = node12;
		return node2;
	}


	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		
		while(l1 !=null || l2 != null) {
			if (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					head.next = l1;
					l1 = l1.next;
				} else {
					head.next = l2;
					l2 = l2.next;				
				}
				head = head.next;
			}else if (l1 == null) {
				head.next = l2;
				break;
			}else if (l2 == null) {
				head.next = l1;
				break;
			}
		}  
		
		return head.next;
    }
}
