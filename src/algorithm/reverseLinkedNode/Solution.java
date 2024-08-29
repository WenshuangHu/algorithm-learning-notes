package algorithm.reverseLinkedNode;

public class Solution {
    public static void main(String[] args) {
//        Node head = initNodeList();
//        Node result = reverseNode(head);
//        output(result);
//        Node head2 = initNodeList();
//        Node result2 = reverse(head2);
//        output(result2);
        Node head3 = initNodeList();
        Node result3 = reverse3(head3);
        output(result3);
    }

    private static Node reverse3(Node head) {
        if(head == null) {
            throw new IllegalArgumentException("");
        }
        Node currentNode = head;
        Node preNode = null;
        while (currentNode.next != null) {
            Node tmp = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = tmp;
        }
        currentNode.next = preNode;

        return currentNode;
    }


    private static void output(Node result) {
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

    private static Node reverse(Node node) {
        if(node == null || node.next == null) {
            return node;
        }
        Node new_node = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return new_node;
    }

    private static Node reverseNode(Node head) {
        Node currentNode = head;
        Node preNode = null;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }
        return preNode;
    }


    private static Node initNodeList() {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        return new Node(1, node2);
    }

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
