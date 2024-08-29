package algorithm.deleteDupilcatedNode;

public class Solution {
    public static void main(String[] args) {
        ListNode node = buildNode1();
        ListNode result = removeDuplicatedNode(node);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }

    public static ListNode removeDuplicatedNode(ListNode node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Node cannot be empty.");
        }
        ListNode currentNode = node;
        ListNode nextNode = node.next;
        while(nextNode != null) {
            if(currentNode.val == nextNode.val) {
                currentNode.next = nextNode.next;
            } else {
                currentNode = currentNode.next;
            }
            nextNode = nextNode.next;
        }
        return node;
    }

    private static ListNode buildNode1() {
        ListNode node1 = new ListNode(1);
        ListNode node11 = new ListNode(1);
        ListNode node5 = new ListNode(5);
        ListNode node55 = new ListNode(5);
        ListNode node7 = new ListNode(7);
        ListNode node9 = new ListNode(9);
        node1.next = node11;
        node11.next = node5;
        node5.next = node55;
        node55.next = node7;
        node7.next = node9;
        return node1;
    }
}
